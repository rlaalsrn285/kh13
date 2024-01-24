package com.kh.spring10.controller;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	private MemberDao memberdao;
	//dao라고 안하는이유는 이제 dao를 컨트롤러내에서 여러개 쓰는경우도 있기때문
	 
	  @GetMapping("/join") 
	  public String join() { 
		  return"/WEB-INF/views/member/join.jsp"; 
	  }
	  
	  @PostMapping("/join") 
	  public String join(@ModelAttribute MemberDto dtodto) {
		  memberdao.join(dtodto); 
		  return "redirect:joinFinish"; 
		}
	  
	  @RequestMapping("/joinFinish") 
	  public String joinFinish() { 
		  return "/WEB-INF/views/member/joinFinish.jsp"; 
	  }
	  
	  @RequestMapping("/testLogin")
	  public String sssss(HttpSession ss) {
		  ss.setAttribute("asd123", "testuser11");
		  return "redirect:/";
	  }
	  
	  @RequestMapping("/testLogout")
	  public String rrrr(HttpSession rr) {
		  rr.removeAttribute("asd123");
		  return "redirect:/";
	  }
	  //로그인
	  @GetMapping("/login")
		public String login() {
			return "/WEB-INF/views/member/login.jsp";
		}
	  
	  @PostMapping("/login")
	  public String lll(@ModelAttribute MemberDto iidto,
			  HttpSession ss) {
		  MemberDto ffdto = memberdao.selectOne(iidto.getMemberId());
		  boolean isValid = ffdto != null 
					&& iidto.getMemberPw().equals(ffdto.getMemberPw());
		  if(isValid) {
				//세션에 데이터 추가
			  ss.setAttribute("loginId", ffdto.getMemberId());
				
				return "redirect:/";
			}
			else {
				return "redirect:login";
			}
		}
	  @RequestMapping("/logout")
		public String logout(HttpSession session) {
			session.removeAttribute("loginId");
			return "redirect:/";
		}
	  
	  }
	  
	  