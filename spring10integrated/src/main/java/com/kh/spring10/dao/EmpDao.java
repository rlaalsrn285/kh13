package com.kh.spring10.dao;

import java.util.List;

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

	//사원 수정
	public boolean edit(EmpDto dto) {
		String sql = "update emp set "
				+ "emp_name=?,emp_dept=?,emp_date=?,emp_sal=? "
				+ "where emp_no=?";
		Object[] data = new Object[] {
				dto.getEmpName(),dto.getEmpDept(),dto.getEmpDate(),dto.getEmpSal(),dto.getEmpNo()
		};
		return jdbcTT.update(sql,data) > 0;
		
	}

	//사원삭제
	public boolean delete(int EmpNoNoNo) {
		String sql = "delete emp where emp_no=?";
		Object[] nonono = {EmpNoNoNo};
		return jdbcTT.update(sql,nonono) > 0 ;
	}

	//리스트조회
	public List<EmpDto> selectList(){
		String sql = "select * from emp order by emp_no asc";
		return jdbcTT.query(sql,mapper);
	}
	
	//키워드 조회
	public List<EmpDto> selectList(String column,String keyword){
		String sql = "select * from emp where instr("+column+",?) > 0"
				+ " order by "+column+" asc, emp_no asc";
		
		Object[] data = {keyword};
		return jdbcTT.query(sql, mapper,data);
	}
	
	//상세조회
	public EmpDto selectOne(int empNoNo) {
		String sql = "select * from emp where emp_no=?";
		Object[] data = new Object[]{empNoNo};
		List<EmpDto> listtt = jdbcTT.query(sql, mapper,data);
		return listtt.isEmpty()? null : listtt.get(0);
		}
	}


