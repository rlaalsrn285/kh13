package com.kh.spring11.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring11.dto.BoardDto;

@Service
public class BoardMapper implements RowMapper<BoardDto> {

	@Override
	public BoardDto mapRow(ResultSet rs, int idx) throws SQLException {
		BoardDto dto = new BoardDto();
		
		dto.setBoardNo(rs.getInt("board_no"));
		dto.setBoardTitle(rs.getString("board_title"));
		dto.setBoardContent(rs.getString("board_content"));
		dto.setBoardWriter(rs.getString("board_writer"));
		dto.setBoardWtime(rs.getDate("board_wtime"));
		dto.setBoardEtime(rs.getDate("board_etime"));
		dto.setBoardReadcount(rs.getInt("board_readcount"));
		
		return dto;
	}

}
