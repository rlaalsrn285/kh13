package com.kh.spring11.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AjaxRestController {

	@RequestMapping("/hello")
	public String hhh(){
		
		return "asdfasdf";
	}
}
