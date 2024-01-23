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

import com.kh.spring10.dao.EmpDao;
import com.kh.spring10.dto.EmpDto;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpDao dao;
	
	//등록
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
	
	@RequestMapping ("/list")
	public String list(@RequestParam(required = false) String ccc,
					@RequestParam(required = false) String keykey,
			Model aamm) {
		
		boolean isS = ccc !=null && keykey != null;
		
		List<EmpDto> listt = isS ?
				dao.selectList(ccc,keykey) : dao.selectList();
		
		aamm.addAttribute("lllist", listt);
		return "/WEB-INF/views/emp/list2.jsp";
	}
	
	@RequestMapping("/detail")
	public String dddd(@RequestParam int emempNo, Model mm) {
		EmpDto dtdto = dao.selectOne(emempNo);
		mm.addAttribute("empdtdto", dtdto);
		return "/WEB-INF/views/emp/detail.jsp";
	}
	
	@RequestMapping("/delete")
	public String dfdf(@RequestParam int emNNN) {
		dao.delete(emNNN);
		return "redirect:list"; 
	}
}







