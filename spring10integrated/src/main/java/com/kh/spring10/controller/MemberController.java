package com.kh.spring10.controller;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.MemberDto;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	 //회원가입
	  @GetMapping("/join") 
	  public String join() { 
		  return"/WEB-INF/views/member/join.jsp"; 
	  }
	  
	  @PostMapping("/join") 
	  public String join(@ModelAttribute MemberDto dtodto) {
		  memberDao.join(dtodto); 
		  return "redirect:joinFinish"; 
		}
	  
	  @RequestMapping("/joinFinish") 
	  public String joinFinish() { 
		  return "/WEB-INF/views/member/joinFinish.jsp"; 
	  }
	  //로그인 기능
	  @GetMapping("/login")
	  public String login() {
		  return "/WEB-INF/views/member/login.jsp";
	  }
	  
	  @PostMapping("/login")
	  public String login(@ModelAttribute MemberDto inputDto,
			  									HttpSession ss) {
		  MemberDto ffdto = memberDao.selectOne(inputDto.getMemberId());
		  // ffdto에  inputdto 상세조회한 아이디를 넣겟다
		  boolean isVV = ffdto != null && inputDto.getMemberPw().equals(ffdto.getMemberPw());
		  // inputdto의 겟아디가 null이 아님(즉 입력받은아이디가존재) && 입력받은비번.이퀄(찾은아디비번) 이냐 의 예 , 아니오
		  
		  if(isVV) { //isvv가 참이면 (로그인성공시)
			  ss.setAttribute("loginId", ffdto.getMemberId());
			  //login 이라는 이름에다가 찾은dto아이디의 값을 넣어라(이거 근데 성공이면 찾은아이디나 입력아이디나상관없음)
			  return "redirect:/";
			  // 로그인하고 기본페이지인 / 페이지로 돌아가라 
		  }else {
			  return "redirect:login?error";
			  //로그인 실패시에는 되돌아가라 url이 login?error인 페이지로
		  }
	  }
	  //로그아웃기능
	  @RequestMapping("/logout")
	  public String logout(HttpSession ss) {
		  ss.removeAttribute("loginId");
		  return "redirect:/";
		  // 세션의 이름이 loginID 이니까 위에 로그인세션에 있음 그이름을 지정하고 삭제하라고 한거 그리고 기본창으로 돌아가라라는 뜻
	  }
	  @RequestMapping("/mypage")
	  public String mypage(HttpSession ss, Model mm) {
		  //세션에는 이미 아이디가 있기때문에 꺼냄 string으로형변환한 이유는 세션에서꺼낼땐 오브젝트타입이여서
		  //그리고 지금꺼낸건 세션에 이름으로 지정한거 쓴거임 위에 로그아웃이랑 똑같음
		  String llid = (String) ss.getAttribute("loginId");
		  // 2. 꺼낸아이디를 상세조회 들어간값은 꺼낸 스트링변수를 넣은것
		  MemberDto memdto = memberDao.selectOne(llid);
		  // 3. 상세조회한걸 jsp에서 쓸수있게 모델에담는다 jsp 에서쓸때는 mmdto로 써야하고 지금 윗줄에 memdto를  넣은것
		  mm.addAttribute("mmdto", memdto);
		  //4. 마이페이지 jsp화면을 띄워라	절대경로임
		  return "/WEB-INF/views/member/mypage.jsp";
		  
		  
	  }
	  
	  }
	  
	  