package com.kh.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/table")
public class TableController {
	
	@RequestMapping("/test02")
	public String test0101() {
		return "/WEB-INF/views/table/test2.jsp";
	}

}
