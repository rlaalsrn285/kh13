package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.EmpDto;

public class EmpMapper implements RowMapper<EmpDto>{
	@Override
	
	public EmpDto mapRow(ResultSet rs, int idx) throws SQLException {
		//rs ---> EmpDto
		EmpDto dto = new EmpDto();
		dto.setEmpNo(rs.getInt("emp_no"));//DB(emp_no) → DTO(empNo)
		dto.setEmpName(rs.getString("emp_name"));//DB(emp_name) → DTO(empName)
		dto.setEmpDept(rs.getString("emp_dept"));//DB(emp_dept) → DTO(empDept)
		dto.setEmpDate(rs.getString("emp_date"));//DB(emp_date) → DTO(empDate)
		dto.setEmpSal(rs.getInt("emp_sal"));//DB(emp_sal) → DTO(empSal)
		return dto;
	}
}