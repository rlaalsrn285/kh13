package com.kh.spring11.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = {Controller.class})
public class ErrorController {

	
	@ExceptionHandler(Exception.class)
	public String handler(Exception ex) {
		ex.printStackTrace();
		
		return "/WEB-INF/views/error.jsp";
	}
}
