package com.kh.spring11.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring11.dao.AttachDao;
import com.kh.spring11.dao.ItemDao;
import com.kh.spring11.dto.AttachDto;
import com.kh.spring11.dto.ItemDto;

@Controller
@RequestMapping("/admin/item")
public class AdminItemController {

	@Autowired
	private AttachDao attachDao;
	@Autowired
	private ItemDao itemDao;
	

	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/views/admin/item/add.jsp";
	}
	
	//multipart 방식으로 전송되는 데이터는 
	//application.properties에 몇 가지 설정을 한 뒤 자연스럽게 수신이 가능하다
	//(중요) 파일은 MultipartFile 형태로 수신한다
	@PostMapping("/add")
	public String add(@ModelAttribute ItemDto itemDto, 
								@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
//		충전상품 등록
		int itemNo = itemDao.getSequence();
		itemDto.setItemNo(itemNo);
		itemDao.insert(itemDto);
		
//		if(attach.isEmpty() == false) {
		if(!attach.isEmpty()) {
			System.out.println("파일명 = " + attach.getOriginalFilename());
			System.out.println("파일유형 = " + attach.getContentType());
			System.out.println("파일크기 = " + attach.getSize());
			
			//파일명을 대체하기 위한 시퀀스 생성
			int attachNo = attachDao.getSequence();
			
			//파일과 관련된 작업(저장 등)을 구현
			//[1] 파일이 저장될 위치(디렉터리)를 정한다
			//[2] 1번에서 정한 위치에 신규 파일을 생성해야 한다
			//[3] 사용자에게서 전송받은 파일의 내용을 2번 파일에 복사한다
			
			//[1]
			//File dir = new File("D:/upload");//디렉터리 객체 생성
			File dir = new File(System.getProperty("user.home") , "upload");
			dir.mkdirs();//실제 디렉터리 생성
			//System.out.println("dir = " + dir.getAbsolutePath());
			
			//[2] 
			//File target = new File(dir, attach.getOriginalFilename());//파일 객체 생성
			File target = new File(dir, String.valueOf(attachNo));//파일 객체 생성
			
			//[3]
			attach.transferTo(target);//파일 내용 복사
			
			//첨부파일 정보를 DB에 저장
			AttachDto attachDto = new AttachDto();
			attachDto.setAttachNo(attachNo);
			attachDto.setAttachName(attach.getOriginalFilename());
			attachDto.setAttachType(attach.getContentType());
			attachDto.setAttachSize(attach.getSize());
			
			attachDao.insert(attachDto);
			
			//연결
			itemDao.connect(itemNo, attachNo);
		}
		return "redirect:list";
	}
	
	//포인트 상품 목록
		@RequestMapping("/list")
		public String list(Model model) {
			List<ItemDto> list = itemDao.selectList();
			model.addAttribute("list", list);
			return "/WEB-INF/views/admin/item/list.jsp";
		}
		
		//상품번호를 전달하면 파일번호를 찾아서 리다이렉트하는 페이지
		@RequestMapping("/image")
		public String image(@RequestParam int itemNo) {
			try {
				int attachNo = itemDao.findAttachNo(itemNo);
				return "redirect:/download?attachNo="+attachNo;
			}
			catch(Exception e) {
				//return "기본이미지 주소";
				return "redirect:https://via.placeholder.com/200x100";
			}
		}
		
		//충전 상품 삭제
		//- 주의할 점은 파일 번호를 먼저 알아내고 지워야 한다는 것
		@GetMapping("/delete")
		public String delete(@RequestParam int itemNo) {
			try {
				int attachNo = itemDao.findAttachNo(itemNo);//아이템번호로 파일번호찾고
				
				//실제파일삭제
				File dir = new File(System.getProperty("user.home"), "upload");
				File target = new File(dir, String.valueOf(attachNo));
				target.delete();
				attachDao.delete(attachNo);//파일정보지우고
			}
			catch(Exception e) {}
			finally {//예외 여부와 관계 없이 무조건 실행되는 구문
				itemDao.delete(itemNo);//아이템정보삭제
			}
			
			return "redirect:list";
		}

		//충전상품 정보 수정
		@GetMapping("/edit")
		public String edit(@RequestParam int itemNo, Model model) {
			ItemDto itemDto = itemDao.selectOne(itemNo);
			model.addAttribute("itemDto", itemDto);
			return "/WEB-INF/views/admin/item/edit.jsp";
		}
		@PostMapping("/edit")
		public String edit(@ModelAttribute ItemDto itemDto, 
									@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
			//우선 아이템 정보는 첨부파일과 관계 없이 수정 처리
			itemDao.update(itemDto);
			
			//첨부파일이 있다면 기존의 첨부파일을 지우고 신규 첨부파일을 등록
			if(!attach.isEmpty()) {
				//기존 파일 삭제
				try {
					int attachNo = itemDao.findAttachNo(itemDto.getItemNo());//파일번호찾고
					File dir = new File(System.getProperty("user.home"), "upload");
					File target = new File(dir, String.valueOf(attachNo));
					target.delete();//실제파일 삭제
					attachDao.delete(attachNo);//DB에서 삭제
				}
				catch(Exception e) {}//예외 발생 시 아무것도 안함(skip)
				
				//신규 파일 추가
				//- attach_seq 번호 생성
				//- 실물 파일을 저장
				//- DB에 insert
				//- item과 connect 처리
				int attachNo = attachDao.getSequence();//시퀀스생성
				File dir = new File(System.getProperty("user.home"), "upload");
				File target = new File(dir, String.valueOf(attachNo));
				attach.transferTo(target);//실물파일저장
				
				AttachDto attachDto = new AttachDto();
				attachDto.setAttachNo(attachNo);
				attachDto.setAttachName(attach.getOriginalFilename());
				attachDto.setAttachType(attach.getContentType());
				attachDto.setAttachSize(attach.getSize());
				attachDao.insert(attachDto);//DB저장
				
				itemDao.connect(itemDto.getItemNo(), attachNo);//연결처리
			}
			
			return "redirect:list";
		}
}
