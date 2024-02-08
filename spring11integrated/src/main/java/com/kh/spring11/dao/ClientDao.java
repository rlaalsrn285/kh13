package com.kh.spring11.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring11.dto.ClientDto;
import com.kh.spring11.mapper.ClientMapper;

@Repository
public class ClientDao {

	@Autowired
	private JdbcTemplate jdbcTT;
	
	@Autowired
	private ClientMapper clientMapper;
	
	//등록
	/*
	 * public void insert(ClientDto dto) {
	 * 
	 * }
	 * 
	 * //목록 public List<ClientDto> selectList(){ }
	 * 
	 * //상세 public ClientDto selectOne(String clientId) { } //수정 public boolean
	 * updateClientPassword(ClientDto dto) {
	 * 
	 * } //삭제 public boolean delete(String clientId) {
	 * 
	 * }
	 */
}







