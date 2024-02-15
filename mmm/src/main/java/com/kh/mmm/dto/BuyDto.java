package com.kh.mmm.dto;

import java.sql.Date;

public class BuyDto {
	
	private int buySerial;
	private String memberId;
	private int itemNo;
	private String itemName;
	private Date buyTime;
	private int buyQty;
	private int buyTotal;
	
	public String getMemberId() {
		return memberId;
	}
	public int getBuySerial() {
		return buySerial;
	}
	public void setBuySerial(int buySerial) {
		this.buySerial = buySerial;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public int getBuyQty() {
		return buyQty;
	}
	public void setBuyQty(int buyQty) {
		this.buyQty = buyQty;
	}
	public int getBuyTotal() {
		return buyTotal;
	}
	public void setBuyTotal(int buyTotal) {
		this.buyTotal = buyTotal;
	}
	public BuyDto() {
		super();
	}

}
