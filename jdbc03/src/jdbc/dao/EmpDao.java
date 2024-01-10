package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.EmpDto;
import jdbc.dto.PocketmonDto;
import jdbc.mapper.EmpMapper;
import jdbc.mapper.PocketmonMapper;
import jdbc.util.jdbcHelper;

public class EmpDao {
	
	public void insertt(EmpDto Edtt) {
		JdbcTemplate JdbcTT = jdbcHelper.getJdbcTemplate();
		String sqll = "insert into Emp(emp_no,emp_name,emp_dept,emp_date,emp_sal)"+
				"values(?,?,?,?,?)";
		
		Object[] Oob = {
				Edtt.getEmpNo(),
				Edtt.getEmpName(),
				Edtt.getEmpDept(),
				Edtt.getEmpDate(),
				Edtt.getEmpSal()
		};
		JdbcTT.update(sqll,Oob);
	}

	public boolean update(EmpDto dto) {
		JdbcTemplate jdbcTem = jdbcHelper.getJdbcTemplate();
		String sql = "update Emp set "
				+ "emp_name=?,emp_dept=?,"
				+ "emp_date=?,emp_sal=? "
				+ "where emp_no=?";
		Object[] dataa = {
				dto.getEmpName(),
				dto.getEmpDept(),
				dto.getEmpDate(),
				dto.getEmpSal(),
				dto.getEmpNo()
		};
		return jdbcTem.update(sql,dataa) > 0 ;
	}
	
	public boolean delete(int empNo) {
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "delete emp where emp_no=?";
		Object[] data = {empNo};
		int result = jdbcTemplate.update(sql, data);
		if(result > 0) return true;
		else return false;
	}
	
	//단체조회
	public List<EmpDto>selectListt(){
		JdbcTemplate jdbcTT = jdbcHelper.getJdbcTemplate();
		String sql2 = "select * from emp order by emp_no asc";
		EmpMapper mapperr = new EmpMapper();
		return jdbcTT.query(sql2,mapperr);
	}
	//하나조회
	public EmpDto select111(int Empnom33) {
		JdbcTemplate jtjt = jdbcHelper.getJdbcTemplate();
		String ssqql = "select * from emp where emp_no = ?";
		Object[] atad = new Object[]{Empnom33};
		EmpMapper maappp = new EmpMapper();
		List<EmpDto> listt = jtjt.query(ssqql, maappp, atad); 
		
		return listt.isEmpty() ? null : listt.get(0); 
		
	}
}
