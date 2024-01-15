package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.EmpDao;
import com.kh.spring05.dto.EmpDto;

@RestController
@RequestMapping("/emp")
public class EmpController {

	
	//	private JdbcTemplate jdbcTT; <-이거이제필요없음 dao에 모든기능이 다들어가잇으니
	@Autowired
	private EmpDao dao;
	
	//@Autowired
	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		
		dao.insert(dto);
		return "사원등록완료";
	}
	//연습용주소 /Emp/insert?empName=도라에몽&empDept=진구네집&empDate=2000-02-02&emp_sal=5000 <-이거 틀린주소 이유생각헤보기 자주실수
}
