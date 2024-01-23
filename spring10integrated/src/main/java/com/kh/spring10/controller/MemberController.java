package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.MemberDto;

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
}
