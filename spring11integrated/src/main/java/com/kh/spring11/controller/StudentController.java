package com.kh.spring11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring11.dao.StudentDao;
import com.kh.spring11.dto.StudentDto;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentDao studentDao;
	
	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/views/student/add.jsp";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute StudentDto studentDto) {
		studentDao.insert(studentDto);
		return "redirect:list";
	}
	
	
	@RequestMapping("/list")
	public String list(@RequestParam(required = false) String keyword, Model model) {
		boolean isSearch = keyword != null;
		List<StudentDto> list = isSearch ? 
			studentDao.selectList("name", keyword) : studentDao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/student/list.jsp";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int studentId, Model model) {
		StudentDto studentDto = studentDao.selectOne(studentId);
		model.addAttribute("studentDto", studentDto);
		int rank = studentDao.rank(studentDto.getTotal());
		model.addAttribute("rank", rank); 
		return "/WEB-INF/views/student/detail.jsp";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int studentId, Model model) {
		StudentDto studentDto = studentDao.selectOne(studentId);
		model.addAttribute("studentDto", studentDto);
		return "/WEB-INF/views/student/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute StudentDto studentDto) {
		studentDao.update(studentDto);
		return "redirect:detail?studentId="+studentDto.getStudentId();
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int studentId) {
		studentDao.delete(studentId);
		return "redirect:list";
	}
}
