package com.kh.mmm.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.mmm.dao.AttachDao;
import com.kh.mmm.dao.MemberDao;
import com.kh.mmm.dto.MemberDto;
import com.kh.mmm.service.AttachService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private AttachDao attachDao;
	
	@Autowired
	private AttachService attachService;
	
	@Autowired
	private BuyDao buyDao;
	
	//회원가입
	@GetMapping("/join")
	public String join() {
		return "/WEB-INF/views/member/join.jsp";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto,
								@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
		memberDao.insert(memberDto);
		
		if(!attach.isEmpty()) {
			int attachNo = attachService.save(attach);//파일저장+DB저장
			memberDao.connect(memberDto.getMemberId(), attachNo);//연결
		}
		return "redirect:joinFinish";
	}
	@RequestMapping("/joinFinish")
	public String joinFinish() {
		return "/WEB-INF/views/member/joinFinish.jsp";
	}
	
	@RequestMapping("/testLogin")
	public String testLogin(HttpSession session) {
		session.setAttribute("loginId", "testuser1");
		return "redirect:/";
	}
	@RequestMapping("/testLogout")
	public String testLogout(HttpSession session) {
		session.removeAttribute("loginId");
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/WEB-INF/views/member/login.jsp";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto inputDto, 
																HttpSession session) {
		MemberDto findDto = memberDao.selectOne(inputDto.getMemberId());
		boolean isValid = findDto != null 
				&& inputDto.getMemberPw().equals(findDto.getMemberPw());
		if(isValid) {
			session.setAttribute("loginId", findDto.getMemberId());
			session.setAttribute("loginLevel", findDto.getMemberLevel());
			
			memberDao.updateMemberLogin(findDto.getMemberId());
			
			return "redirect:/";
		}
		else {//로그인 실패
			return "redirect:login?error";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginId");
		session.removeAttribute("loginLevel");
		return "redirect:/";
	}
	
	@RequestMapping("/mypage")
	public String mypage(HttpSession session, Model model) {
		//1. 세션에 저장된 아이디를 꺼낸다
		String loginId = (String) session.getAttribute("loginId");

		//2. 아이디에 맞는 정보를 조회한다
		MemberDto memberDto = memberDao.selectOne(loginId);
		
		//3. 화면에 조회한 정보를 전달한다
		model.addAttribute("memberDto", memberDto);
		
		//(추가) 현재 사용자의 구매내역을 첨부
		model.addAttribute("buyList", buyDao.selectList(loginId));
		
		//(추가) 현재 사용자의 작성 글 내역을 첨부
		
		
		//4. 연결될 화면을 반환한다
		return "/WEB-INF/views/member/mypage.jsp";
	}
	
	//비밀번호 변경
	@GetMapping("/password")
	public String password() {
		return "/WEB-INF/views/member/password.jsp";
	}
	
	//기존 비밀번호를 originPw, 변경할 비밀번호를 changePw로 처리
	//아이디는 HttpSession에 존재한다
	@PostMapping("/password")
	public String password(@RequestParam String originPw,
										@RequestParam String changePw,
										HttpSession session) {
		//로그인된 사용자의 아이디를 추출
		String loginId = (String) session.getAttribute("loginId");
		
		//비밀번호 검사를 위해 DB에 저장된 정보를 불러온다
		MemberDto findDto = memberDao.selectOne(loginId);
		boolean isValid = findDto.getMemberPw().equals(originPw);
		
		if(isValid) {//입력한 기존 비밀번호가 유효할 경우
			//아이디와 변경할 비밀번호로 DTO를 만들어 DAO의 기능을 호출
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(loginId);
			memberDto.setMemberPw(changePw);
			memberDao.updateMemberPw(memberDto);
			
			return "redirect:passwordFinish";
		}
		else {//입력한 기존 비밀번호가 유효하지 않을 경우
			return "redirect:password?error";
		}
		
	}
	
	@RequestMapping("/passwordFinish")
	public String passwordFinish() {
		return "/WEB-INF/views/member/passwordFinish.jsp";
	}
	
	//개인정보 변경
	@GetMapping("/change")
	public String change(Model model, HttpSession session) {
		//사용자 아이디를 세션에서 추출
		String loginId = (String)session.getAttribute("loginId");
		
		//아이디로 정보 조회
		MemberDto memberDto = memberDao.selectOne(loginId);
		
		//모델에 정보 추가
		model.addAttribute("memberDto", memberDto);
		
		return "/WEB-INF/views/member/change.jsp";
	}
	
	@PostMapping("/change")
	public String change(
			@ModelAttribute MemberDto memberDto, HttpSession session) {
		//세션에서 아이디 추출
		String loginId = (String)session.getAttribute("loginId");
		
		//memberDto에 아이디 설정
		memberDto.setMemberId(loginId);
		
		//DB정보 조회
		MemberDto findDto = memberDao.selectOne(loginId);
		
		//판정
		boolean isValid = memberDto.getMemberPw().equals(findDto.getMemberPw());
		
		//변경 요청
		if(isValid) {
			memberDao.updateMember(memberDto);
			return "redirect:mypage";
		}
		else {
			//이전 페이지로 리다이렉트
			return "redirect:change?error";
		}
	}
	
	//회원 탈퇴
	@GetMapping("/exit")
	public String exit() {
		return "/WEB-INF/views/member/exit.jsp";
	}
	
	@PostMapping("/exit")
	public String exit(@RequestParam String memberPw, HttpSession session) {
		String loginId = (String)session.getAttribute("loginId");
		
		MemberDto findDto = memberDao.selectOne(loginId);
		boolean isValid = findDto.getMemberPw().equals(memberPw);
		
		if(isValid) {
			//탈퇴 전에 프로필번호를 찾아서 삭제 처리
			try {
				int attachNo = memberDao.findAttachNo(loginId);
				attachService.remove(attachNo);//파일삭제+DB삭제
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			memberDao.delete(loginId);//회원탈퇴
			session.removeAttribute("loginId");//로그아웃
			return "redirect:exitFinish";
		}
		else {
			return "redirect:exit?error";
		}
	}
	
	@RequestMapping("/exitFinish")
	public String exitFinish() {
		return "/WEB-INF/views/member/exitFinish.jsp";
	}
	
	//프로필 다운로드 페이지
	@RequestMapping("/image")
	public String image(HttpSession session) {
		try {
			String loginId = (String)session.getAttribute("loginId");
			int attachNo = memberDao.findAttachNo(loginId);
			return "redirect:/download?attachNo="+attachNo;
		}
		catch(Exception e) {
			return "redirect:/image/user.png";
		}
	}
}
