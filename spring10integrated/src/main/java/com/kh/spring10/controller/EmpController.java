package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dto.EmpDto;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpDao dao;
	
	//등록을 위한페이지? (아직이해불가)
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/emp/insert1.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		dao.insert(dto);
		return "redirect:insert3";
	}
	
	@RequestMapping("/insert3")
	public String insert3() {
		return "/WEB-INF/views/emp/insert2.jsp";

	}

	@GetMapping("/edit")
	public String edit(@RequestParam int nn, Model mm) {
		EmpDto dtooo = dao.selectOne(nn);
		mm.addAttribute("qqq", dtooo);
		
		return "/WEB-INF/views/emp/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute EmpDto dtdto) {
		if(dao.edit(dtdto)) {
			return "redirect:editsuccess";
		}
		else {
			return "redirect:editfail";
		}
	}
	
	@RequestMapping("/editsuccess")
	public String success() {
		return "/WEB-INF/views/emp/editsuccess.jsp";
	}
	
	@RequestMapping("/editfail")
	public String fail() {
		return "/WEB-INF/views/emp/editfail.jsp";
	}
}







