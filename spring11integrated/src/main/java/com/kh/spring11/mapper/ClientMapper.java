package com.kh.spring11.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring11.dto.ClientDto;

@Service
public class ClientMapper implements RowMapper<ClientDto> {

	@Override
	public ClientDto mapRow(ResultSet rs, int idx) throws SQLException {
		ClientDto dto = new ClientDto();
		
		dto.setClientId(rs.getString("member_id"));
		dto.setClientPassword(rs.getString("member_pw"));
		dto.setClientNickname(rs.getString("member_nick"));
		dto.setClientGrade(rs.getString("member_birth"));
		dto.setClientJoin(rs.getDate("member_contact"));
		dto.setClientPoint(rs.getLong("client_point"));
		
		return dto;
	}

}
