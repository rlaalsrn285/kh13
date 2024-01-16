package com.kh.spring07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.kh.spring07.dao.StudentDao;
import com.kh.spring07.dto.StudentDto;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentDao dao;
	
	@RequestMapping("/add")
	public String add(@ModelAttribute StudentDto dto) {
		dao.add(dto);
		return "학생등록";
		//연습용 주소 /student/add?name=돌쇠&koreanScore=50&mathScore=60&englishScore=45
	}
}
