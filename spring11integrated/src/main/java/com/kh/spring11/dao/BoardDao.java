package com.kh.spring11.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring11.dto.BoardDto;
import com.kh.spring11.mapper.BoardListMapper;
import com.kh.spring11.mapper.BoardMapper;

@Repository
public class BoardDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	BoardMapper boardMapper;
	
	@Autowired
	BoardListMapper boardListMapper;
	
	//게시글등록 (insert)
	//등록할 때 시퀀스 번호를 생성하면 절대 안된다 나중에하는건가?
	public void insert(BoardDto boardDto) {
		//String sql = "insert into board(7개) values(?, ?, ?, ?, sysdate, null, 0)";
		//String sql = "insert into board(4개) values(?, ?, ?, ?)";
		String sql = "insert into board("
						+ "board_no, board_title, board_content, board_writer"
					+ ") values(?, ?, ?, ?)";
		Object[] data = {
			boardDto.getBoardNo(), boardDto.getBoardTitle(),
			boardDto.getBoardContent(), boardDto.getBoardWriter()
		};
		jdbcTemplate.update(sql, data);
	}
	//게시글 목록
	public List<BoardDto> selectList(){
		String sql = "select board_no, board_title, board_writer,"
				+ "board_wtime, board_etime, board_readcount"
				+ " from board order by board_no desc";
		return jdbcTemplate.query(sql, boardListMapper);
		// query 를 실행하고 list로 반환함
	}
	//게시글 검색
	public List<BoardDto> selectList(String column, String keyword){
		String sql = "select * from board where instr("+column+", ?) > 0 order by board_no desc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, boardMapper, data);
	}
	//상세검색
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, boardMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	public int getSequence() {
		String sql = "select board_seq.nextval from dual";
		//jdbcTemplate.queryForObject(구문, 결과자료형);
		return jdbcTemplate.queryForObject(sql, int.class);
	}
	
	public boolean delete(int boardNo) {
		String sql = "delete board where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	public boolean update(BoardDto boardDto) {
		String sql = "update board "
						+ "set board_title=?, board_content=?, board_etime=sysdate "
						+ "where board_no = ?";
		Object[] data = {
			boardDto.getBoardTitle(), boardDto.getBoardContent(),
			boardDto.getBoardNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
}
