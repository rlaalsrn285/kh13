package com.kh.mmm.dto;

public class ReplyDto {

	private int replyNo;
	private String replyContent;
	private String replyTime;
	private String replyWriter;
	private int replyOrigin;
	public int getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	public int getReplyOrigin() {
		return replyOrigin;
	}
	public void setReplyOrigin(int replyOrigin) {
		this.replyOrigin = replyOrigin;
	}
	public ReplyDto() {
		super();
	}
}
