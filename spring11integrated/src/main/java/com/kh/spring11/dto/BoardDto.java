package com.kh.spring11.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	
	public String getBoardWriterStr() {
		if(boardWriter == null)
			return "탈퇴한사용자";
		else
			return boardWriter;
	}
	
	public String getBoardWtimeStr() {
		LocalDate today = LocalDate.now();//오늘날짜
		LocalDate wtime = boardWtime.toLocalDate();//작성일자
		if(wtime.equals(today)) {//작성일이 오늘이면
			//Date ---> Timestamp ---> LocalDateTime ---> LocalTime
			Timestamp stamp = new Timestamp(boardWtime.getTime());
			LocalDateTime time = stamp.toLocalDateTime();
			LocalTime result = time.toLocalTime();
			return result.toString();//시간 반환
		}
		else {//작성일이 이전이면
			return wtime.toString();//날짜 반환
		}
	}
	

}
