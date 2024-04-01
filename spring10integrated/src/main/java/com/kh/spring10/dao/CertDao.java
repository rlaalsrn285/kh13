package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.CertDto;
import com.kh.spring10.mapper.CertMapper;

@Repository
public class CertDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CertMapper certMapper;
	
	public void insert(CertDto certDto) {
		String sql = "insert into cert(cert_email, cert_number) values(?, ?)";
		Object[] data = {certDto.getCertEmail(), certDto.getCertNumber()};
		jdbcTemplate.update(sql, data);
	}
	public boolean delete(String certEmail) {
		String sql = "delete cert where cert_email = ?";
		Object[] data = {certEmail};
		return jdbcTemplate.update(sql, data) > 0;
	}
	public CertDto selectOne(String certEmail) {
		String sql = "select * from cert where cert_email = ?";
		Object[] data = {certEmail};
		List<CertDto> list = jdbcTemplate.query(sql, certMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	public boolean checkValid(CertDto certDto) {
		String sql = "select * from cert "
						+ "where cert_email = ? "
							+ "and cert_number = ? "
							+ "and cert_time >= sysdate-5/24/60";
		Object[] data = {certDto.getCertEmail(), certDto.getCertNumber()};
		List<CertDto> list = jdbcTemplate.query(sql, certMapper, data);
		return list.isEmpty() ? false : true;
		//return !list.isEmpty();
	}
	
	//5분이 지난 인증번호들을 삭제하는 메소드
	public boolean deleteLegacy() {
		String sql = "delete cert where cert_time < sysdate-5/24/60";
		return jdbcTemplate.update(sql) > 0;
	}
}





