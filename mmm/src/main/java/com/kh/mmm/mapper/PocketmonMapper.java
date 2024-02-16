package com.kh.mmm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.mmm.dto.PocketmonDto;

@Service
public class PocketmonMapper implements RowMapper<PocketmonDto>{

	@Override
	public PocketmonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PocketmonDto dto = new PocketmonDto();
		dto.setPocketmonNo(rs.getInt("pocketmon_no"));
		dto.setPocketmonName(rs.getString("pocketmon_name"));
		dto.setPocketmonType(rs.getString("pocketmon_type"));
		return dto;
	}

}
