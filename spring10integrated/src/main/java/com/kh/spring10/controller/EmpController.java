package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dto.EmpDto;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpDao dao;
	
	//등록을 위한페이지? (아직이해불가)
	@RequestMapping("/insert1")
	public String insert1() {
		return "/WEB-INF/views/emp/insert1.jsp";
	}
	
	@RequestMapping("/insert2")
	public String insert2(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		return "redirect:insert3";
	}
	
	@RequestMapping("/insert3")
	public String insert3() {
		return "/WEB-INF/views/emp/insert2.jsp";

	}

	
}







