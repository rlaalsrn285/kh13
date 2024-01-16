package com.kh.spring05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.EmpDao;
import com.kh.spring05.dto.EmpDto;

@RestController
@RequestMapping("/emp")
public class EmpController {

	
	//	private JdbcTemplate jdbcTT; <-이거이제필요없음 dao에 모든기능이 다들어가잇으니
	@Autowired
	private EmpDao dao;
	
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmpDto dto) {
		
		dao.insert(dto);
		return "사원등록완료";
	}
	//연습용주소 /emp/insert?empName=도라에몽&empDept=진구네집&empDate=2000-02-02&emp_sal=5000 <-이거 틀린주소 이유생각헤보기 자주실수
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute EmpDto dto) {
		boolean r = dao.edit(dto);
		if(r) {
			return "사원수정완료";
		}
		else {
			return "없는사원번호";
		}
	}	// 연습용주소 emp/edit?empName=테스바꾼&empDept=테스&empDate=2033-02-02&empSal=7878&empNo=99
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int empNo) {
		if(dao.delete(empNo)) {
			return "사원삭제완료";
		}
		else {
			return "없는사원번호";
		}
		//연습용 주소 : /emp/delete?empNo=3
	}

	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column != null && keyword != null;
		List<EmpDto> listt;
		
		if(isSearch) {
			listt=dao.selectList(column, keyword);
		}
		else {
			listt=dao.selectList();
		}
		StringBuffer sbsb = new StringBuffer();
		for(EmpDto dtdto : listt) {
			sbsb.append(dtdto.getEmpNo());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getEmpName());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getEmpDept());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getEmpDate());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getEmpSal());
			sbsb.append("<br>"+"<br>");
		}
		return sbsb.toString();
		//연습용주소 /emp/list?column=emp_name&&keyword=리자
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int empNo) {
		EmpDto dtdto = dao.selectOne(empNo);
		if(dtdto  != null) {
			StringBuffer bfbf = new StringBuffer();
			bfbf.append(dtdto.toString());
			return bfbf.toString();
		}
		else {
			return "없는사원";
		}
		//연습용 주소 /emp/detail?empNo=3
	}
}







