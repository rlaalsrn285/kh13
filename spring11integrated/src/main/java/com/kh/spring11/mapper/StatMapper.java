package com.kh.spring11.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring11.vo.StatVO;

@Service
public class StatMapper implements RowMapper<StatVO>{
	@Override
	public StatVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StatVO statVO = new StatVO();
		statVO.setTitle(rs.getString("항목"));
		statVO.setCount(rs.getInt("개수"));
		return statVO;
	}
}
