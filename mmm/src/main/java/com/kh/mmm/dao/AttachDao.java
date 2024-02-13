package com.kh.mmm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.mmm.dto.AttachDto;
import com.kh.mmm.mapper.AttachMapper;

@Repository
public class AttachDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private AttachMapper attachMapper;
	
	public int getSequence() {
		String sql = "select attach_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}
	public void insert(AttachDto attachDto) {
		String sql = "insert into attach("
						+ "attach_no, attach_name, attach_type, attach_size"
					+ ") values(?, ?, ?, ?)";
		Object[] data = {
			attachDto.getAttachNo(), attachDto.getAttachName(),
			attachDto.getAttachType(), attachDto.getAttachSize()
		};
		jdbcTemplate.update(sql, data);
	}

	public AttachDto selectOne(int attachNo) {
		String sql = "select * from attach where attach_no = ?";
		Object[] data = {attachNo};
		List<AttachDto> list = jdbcTemplate.query(sql, attachMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	public boolean delete(int attachNo) {
		String sql = "delete attach where attach_no = ?";
		Object[] data = {attachNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
}
