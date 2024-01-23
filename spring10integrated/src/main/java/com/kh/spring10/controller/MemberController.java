package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	/*
	 * @Autowired //dao업음현재 임시용 private MemberDao dao;
	 * 
	 * @GetMapping("/join") public String join() { return
	 * "/WEB-INF/views/member/join.jsp"; }
	 * 
	 * @PostMapping("/join") public String join(@ModelAttribute MemberDto dtodto) {
	 * dao.insert(dtodto); return "redirect:join2"; }
	 * 
	 * @RequestMapping("/join2") public String join2() { return
	 * "/WEB-INF/views/member/join2.jsp"; }
	 */
}
