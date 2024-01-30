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
	
	//게시글등록 (insert,create) 이거수정중 매우매우어려워서 마지막에 가르쳐주신다함
	public void insert(BoardDto dto) {
		String sql = "insert into board(board_no, board_title, board_content, board_writer) "
				+ "values(board_seq.nextval,?,?,?)";
		
		Object[] data = {dto.getBoardTitle(),dto.getBoardContent(),dto.getBoardWriter()};
		
		jdbcTemplate.update(sql,data);
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
		return jdbcTemplate.query(sql, mapper, data);
	}
}
