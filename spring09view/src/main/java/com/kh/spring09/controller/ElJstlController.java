package com.kh.spring09.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring09.dto.PocketmonDto;

@Controller
@RequestMapping("/el-jstl")
public class ElJstlController {
	
	@RequestMapping("/test01")
	public String test0101(Model momo) {
		
		momo.addAttribute("a", 99);
		momo.addAttribute("b", "구리구방구리");
		momo.addAttribute("cc", 333.333);
		return "/WEB-INF/views/elJstl.jsp";
	}

	@RequestMapping("/test02")
	public String test0202(Model mmm) {
		
		PocketmonDto dtdt = new PocketmonDto();
		dtdt.setPocketmonNo(99);
		dtdt.setPocketmonName("갸라도스");
		dtdt.setPocketmonType("물속성");
		mmm.addAttribute("asdasd", dtdt);
		
		return "/WEB-INF/views/elJstl2.jsp";
	}
	
	@RequestMapping("/test03")
	public String test03() {
		
		
		return "/WEB-INF/views/elJstl3.jsp";
	}
	
	@RequestMapping("/test04")
	public String test(Model mm1) {
		List<Integer> listt = List.of(3,4);
		
		mm1.addAttribute("qwe", listt);
		return "/WEB-INF/views/elJstl4.jsp";
	}
	
	
	
}
