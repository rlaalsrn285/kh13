package com.kh.spring11.dto;

import java.sql.Date;

public class ItemDto2 {

	private int itemNo;
    private String itemName;
    private int itemPrice;
    private Date itemRegist;
    
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
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Date getItemRegist() {
		return itemRegist;
	}
	public void setItemRegist(Date itemRegist) {
		this.itemRegist = itemRegist;
	}
}
