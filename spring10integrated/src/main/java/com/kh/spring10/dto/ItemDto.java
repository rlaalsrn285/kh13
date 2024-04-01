package com.kh.spring10.dto;

public class ItemDto {
	private int itemNo;
	private String itemName;
	private int itemPrice, itemCharge;
	public ItemDto() {
		super();
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
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemCharge() {
		return itemCharge;
	}
	public void setItemCharge(int itemCharge) {
		this.itemCharge = itemCharge;
	}
}
