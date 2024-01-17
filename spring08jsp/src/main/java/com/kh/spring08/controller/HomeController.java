package com.kh.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/welcome")
	public String wel() {
		return "/WEB-INF/views/welcome.jsp";
	}

}
