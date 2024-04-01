package com.kh.spring10.dto;

public class AttachDto {
	private int attachNo;
	private String attachName;
	private String attachType;
	private long attachSize;
	public AttachDto() {
		super();
	}
	public int getAttachNo() {
		return attachNo;
	}
	public void setAttachNo(int attachNo) {
		this.attachNo = attachNo;
	}
	public String getAttachName() {
		return attachName;
	}
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}
	public String getAttachType() {
		return attachType;
	}
	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}
	public long getAttachSize() {
		return attachSize;
	}
	public void setAttachSize(long attachSize) {
		this.attachSize = attachSize;
	}
}
