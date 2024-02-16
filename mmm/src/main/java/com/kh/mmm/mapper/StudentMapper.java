package com.kh.mmm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.mmm.dto.StudentDto;

@Service
public class StudentMapper implements RowMapper<StudentDto>{
	@Override
	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDto dto = new StudentDto();
		dto.setStudentId(rs.getInt("student_id"));
		dto.setName(rs.getString("name"));
		dto.setKoreanScore(rs.getInt("korean_score"));
		dto.setMathScore(rs.getInt("math_score"));
		dto.setEnglishScore(rs.getInt("english_score"));
		return dto;
	}
}
