package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.MemberDto;
import com.kh.spring10.mapper.MemberMapper;

@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate jdbctt;
	
	@Autowired
	private MemberMapper mapper;
	
	//회원가입 join
	public void join(MemberDto dto) {
		String sql = "insert into member("
							+ "member_id, member_pw, member_nick, "
							+ "member_birth,member_contact, member_email, "
							+ "member_post, member_address1, member_address2"
						+ ") values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
			dto.getMemberId(), dto.getMemberPw(), dto.getMemberNick(),
			dto.getMemberBirth(), dto.getMemberContact(), dto.getMemberEmail(),
			dto.getMemberPost(), dto.getMemberAddress1(), dto.getMemberAddress2()
		};
		jdbctt.update(sql, data);
	}
	
	//목록(조회, Read)
		public List<MemberDto> selectList() {
			String sql = "select * from member order by member_id asc";
			//Object[] data = {};
			return jdbctt.query(sql, mapper);
		}
		//검색(조회, Read)
		public List<MemberDto> selectList(String column, String keyword) {
			String sql = "select * from member where instr("+column+", ?) > 0 "
											+ "order by "+column+" asc, member_id asc";
			Object[] data = {keyword};
			return jdbctt.query(sql, mapper, data);
		}

		//상세(조회, Read)
		public MemberDto selectOne(String memberId) {
			String sql = "select * from member where member_id = ?";
			Object[] data = {memberId};
			List<MemberDto> list = jdbctt.query(sql, mapper, data);
			return list.isEmpty() ? null : list.get(0);
		}


		//비밀번호 변경(수정, Update)
		public boolean updateMemberPw(MemberDto dto) {
			String sql = "update member set member_pw=? where member_id=?";
			Object[] data = {dto.getMemberPw(), dto.getMemberId()};
			return jdbctt.update(sql, data) > 0;
		}

		public boolean delete(String memberId) {
			String sql = "delete member where member_id = ?";
			Object[] data = {memberId};
			return jdbctt	.update(sql, data) > 0;
		}

}
