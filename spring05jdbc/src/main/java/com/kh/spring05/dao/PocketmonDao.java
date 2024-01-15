package com.kh.spring05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDto;
import com.kh.spring05.mapper.PocketmonMapper;

@Repository
public class PocketmonDao {

	@Autowired
	private JdbcTemplate jdbcTT;
	
	@Autowired
	private PocketmonMapper mapperr;
	
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no,"
				+ "pocketmon_name,"
				+ "pocketmon_type)"
				+ "values(?,?,?)";
		
		Object[] data = new Object[] {
				dto.getPocketmonNo(),
				dto.getPocketmonName(),
				dto.getPocketmonType()
		};
		jdbcTT.update(sql,data);
		
	}
	
}
