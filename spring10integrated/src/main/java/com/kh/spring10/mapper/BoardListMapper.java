package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.kh.spring10.dto.BoardDto;

@Service
public class BoardListMapper implements RowMapper<BoardDto>{
	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto boardDto = new BoardDto();
		boardDto.setBoardNo(rs.getInt("board_no"));
		boardDto.setBoardTitle(rs.getString("board_title"));
		//boardDto.setBoardContent(rs.getString("board_content"));
		boardDto.setBoardWriter(rs.getString("board_writer"));
		boardDto.setBoardWtime(rs.getDate("board_wtime"));
		boardDto.setBoardEtime(rs.getDate("board_etime"));
		boardDto.setBoardReadcount(rs.getInt("board_readcount"));
		boardDto.setBoardGroup(rs.getInt("board_group"));
		boardDto.setBoardTarget(rs.getObject("board_target", Integer.class));
		boardDto.setBoardDepth(rs.getInt("board_depth"));
		return boardDto;
	}
}
