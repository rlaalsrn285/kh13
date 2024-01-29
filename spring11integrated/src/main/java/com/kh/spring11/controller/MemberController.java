package com.kh.spring11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dto.MemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberDao memberDao;
	
	//회원가입
	@GetMapping("/join")
	public String join() {
		return "/WEB-INF/views/member/join.jsp";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "redirect:joinFinish";
	}
	@RequestMapping("/joinFinish")
	public String joinFinish() {
		return "/WEB-INF/views/member/joinFinish.jsp";
	}
	
	
	//테스트 로그인 & 로그아웃
	//- HttpSession을 사용하고 싶다면 매개변수에 선언만 하면 된다
	//- 등록 : session.setAttribute("key", value)
	//- 확인 : session.getAttribute("key")
	//- 삭제 : session.removeAttribute("key")
	@RequestMapping("/testLogin")
	public String testLogin(HttpSession session) {
		//아이디만 있으면 모든 정보를 불러올 수 있으므로 아이디를 저장
		session.setAttribute("loginId", "testuser1");
		return "redirect:/";
	}
	@RequestMapping("/testLogout")
	public String testLogout(HttpSession session) {
		session.removeAttribute("loginId");
		return "redirect:/";
	}
	
	//실제 로그인
	//- 아이디와 비밀번호 검사를 통과해야만 세션에 데이터를 추가한다
	//- 사용자가 입력한 아이디를 추가한다
	@GetMapping("/login")
	public String login() {
		return "/WEB-INF/views/member/login.jsp";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto inputDto, 
																HttpSession session) {
		//사용자가 입력한 아이디로 회원정보를 조회한다
		MemberDto findDto = memberDao.selectOne(inputDto.getMemberId());
		//로그인 가능 여부를 판정
		boolean isValid = findDto != null 
				&& inputDto.getMemberPw().equals(findDto.getMemberPw());
		//결과에 따라 다른 처리
		if(isValid) {
			//세션에 데이터 추가
			session.setAttribute("loginId", findDto.getMemberId());
			session.setAttribute("loginLevel", findDto.getMemberLevel());
			
			//최종 로그인시각 갱신
			memberDao.updateMemberLogin(findDto.getMemberId());
			
			return "redirect:/";
		}
		else {//로그인 실패
			return "redirect:login?error";
		}
	}
	
	//실제 로그아웃
	//- 로그인 때 검사를 했으므로 추가 검사는 불필요
	//- 로그인 때 저장한 세션의 데이터만 삭제 처리
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginId");//세션의 값 삭제
		session.removeAttribute("loginLevel");//세션의 값 삭제
//		session.invalidate();//세션 삭제(비추천)
		return "redirect:/";
	}
	
	//마이페이지
	//- (중요) 내 아이디는 HttpSession에 있다
	//- 그리고 화면에 정보를 표시해야 한다
	@RequestMapping("/mypage")
	public String mypage(HttpSession session, Model model) {
		//1. 세션에 저장된 아이디를 꺼낸다
		String loginId = (String) session.getAttribute("loginId");

		//2. 아이디에 맞는 정보를 조회한다
		MemberDto memberDto = memberDao.selectOne(loginId);
		
		//3. 화면에 조회한 정보를 전달한다
		model.addAttribute("memberDto", memberDto);
		
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
}
