package com.kh.spring11.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring11.dto.MemberDto;

@Service
public class MemberMapper implements RowMapper<MemberDto>{
	@Override
	public MemberDto mapRow(ResultSet rs, int idx) throws SQLException {
		//조회된 결과의 1줄(13열)을 DTO의 필드(13개)에 이동하는 코드
		MemberDto dto = new MemberDto();
		dto.setMemberId(rs.getString("member_id"));
		dto.setMemberPw(rs.getString("member_pw"));
		dto.setMemberNick(rs.getString("member_nick"));
		dto.setMemberBirth(rs.getString("member_birth"));
		dto.setMemberContact(rs.getString("member_contact"));
		dto.setMemberEmail(rs.getString("member_email"));
		dto.setMemberPost(rs.getString("member_post"));
		dto.setMemberAddress1(rs.getString("member_address1"));
		dto.setMemberAddress2(rs.getString("member_address2"));
		dto.setMemberLevel(rs.getString("member_level"));
		dto.setMemberPoint(rs.getInt("member_point"));
		dto.setMemberJoin(rs.getDate("member_join"));
		dto.setMemberLogin(rs.getDate("member_login"));
		return dto;
	}
}