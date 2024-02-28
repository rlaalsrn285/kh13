package com.kh.spring11.dto;

public class PocketmonDto {

	private int pocketmonNo;
	private String pocketmonName;
	private String pocketmonType;
	public PocketmonDto() {
		super();
	}
	public int getPocketmonNo() {
		return pocketmonNo;
	}
	public void setPocketmonNo(int pocketmonNo) {
		this.pocketmonNo = pocketmonNo;
	}
	public String getPocketmonName() {
		return pocketmonName;
	}
	public void setPocketmonName(String pocketmonName) {
		this.pocketmonName = pocketmonName;
	}
	public String getPocketmonType() {
		return pocketmonType;
	}
	public void setPocketmonType(String pocketmonType) {
		this.pocketmonType = pocketmonType;
	}
}
