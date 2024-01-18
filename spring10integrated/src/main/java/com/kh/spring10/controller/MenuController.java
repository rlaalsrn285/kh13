package com.kh.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
