package com.kh.spring11.dto;

import java.sql.Date;

public class BoardDto {
	
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private Date boardWtime;
	private Date boardEtime;
	private int boardReadcount;
	
	
	
	public BoardDto() {
		super();
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardWtime() {
		return boardWtime;
	}
	public void setBoardWtime(Date boardWtime) {
		this.boardWtime = boardWtime;
	}
	public Date getBoardEtime() {
		return boardEtime;
	}
	public void setBoardEtime(Date boardEtime) {
		this.boardEtime = boardEtime;
	}
	public int getBoardReadcount() {
		return boardReadcount;
	}
	public void setBoardReadcount(int boardReadcount) {
		this.boardReadcount = boardReadcount;
	}
	
	

}
