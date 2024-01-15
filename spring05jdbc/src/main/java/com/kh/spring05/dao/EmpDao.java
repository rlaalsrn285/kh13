package com.kh.spring05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.EmpDto;
import com.kh.spring05.mapper.EmpMapper;

@Repository
public class EmpDao {
	@Autowired
	private JdbcTemplate jdbcTT;
	
	@Autowired
	private EmpMapper mapper;
	
	//사원 등록
	public void insert(EmpDto dto) {
		String sql = "insert into emp("
				+ "emp_no,emp_name,emp_dept,emp_date,emp_sal)"
				+ "values(emp_seq.nextval,?,?,?,?)";
		Object[] data = new Object[] {
				dto.getEmpName(),dto.getEmpDept(),dto.getEmpDate(),dto.getEmpSal()
		};
		
		jdbcTT.update(sql,data);
		
	}

}
