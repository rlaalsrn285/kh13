package com.kh.spring10.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardLikeDao {
	//[C] 좋아요 내역을 등록
	//[D] 좋아요 내역을 삭제
	//[R] 좋아요 여부를 확인
	//[R] 특정 글의 좋아요 개수를 확인
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(String memberId, int boardNo) {
		String sql = "insert into board_like(member_id, board_no) values(?, ?)";
		Object[] data = {memberId, boardNo};
		jdbcTemplate.update(sql, data);
	}
	public boolean delete(String memberId, int boardNo) {
		String sql = "delete board_like where member_id = ? and board_no = ?";
		Object[] data = {memberId, boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	public boolean check(String memberId, int boardNo) {
		String sql = "select count(*) from board_like "
						+ "where member_id = ? and board_no = ?";
		Object[] data = {memberId, boardNo};
		int count = jdbcTemplate.queryForObject(sql, int.class, data);
		return count > 0;
	}
	public int count(int boardNo) {
		String sql = "select count(*) from board_like where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.queryForObject(sql, int.class, data);
	}
}






