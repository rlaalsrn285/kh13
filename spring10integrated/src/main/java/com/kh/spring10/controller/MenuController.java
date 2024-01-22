package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.MenuDao;
import com.kh.spring10.dto.MenuDto;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuDao daodao;
	
	@GetMapping ("/insert")
	public String insert() {
		return "/WEB-INF/views/menu/insert.jsp";
	}
	
	
	@PostMapping("/insert")
	public String insert(MenuDto tototo) {
		daodao.insert(tototo);
		return "redirect:insertComplete";
	}
	
	@RequestMapping("/insertComplete")
	public String insertComplete() {
		return "/WEB-INF/views/menu/insertComplete.jsp";
	}
	
	//수정페이지
		@GetMapping("/change")
		public String change(Model model, @RequestParam int menuNo) {
			MenuDto dto = daodao.selectOne(menuNo);//번호에 대한 메뉴 조회
			if(dto == null) {//없는 메뉴면
				return "redirect:changeFail";//실패 페이지로 강제이동
			}
			else {//있는 메뉴면
				model.addAttribute("dto", dto);//JSP로 메뉴정보를 전달
				return "/WEB-INF/views/menu/change.jsp";//수정화면을 연결
			}
		}
		
		@PostMapping("/change")
		public String change(@ModelAttribute MenuDto dto) {
			daodao.change(dto);
			return "redirect:changeSuccess";
		}
		
		@RequestMapping("/changeSuccess")
		public String changeSuccess() {
			return "/WEB-INF/views/menu/changeSuccess.jsp";
		}
		
		@RequestMapping("/changeFail")
		public String changeFail() {
			return "/WEB-INF/views/menu/changeFail.jsp";
		}
		
		@RequestMapping("/list")
		public String list(
				@RequestParam(required = false) String column, 
				@RequestParam(required = false) String keyword, 
				Model model) {
			boolean isSearch = column != null && keyword != null;
//			List<MenuDto> list = isSearch ? dao.selectList(column, keyword) : dao.selectList();
			List<MenuDto> list;
			if(isSearch) {
				list = daodao.selectList(column, keyword);
			}
			else {
				list = daodao.selectList();
			}
			
			model.addAttribute("list", list);
			return "/WEB-INF/views/menu/list.jsp";
		}

}
