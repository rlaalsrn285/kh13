package com.kh.spring11.dto;

import java.sql.Date;

public class BasketDto {

	private int basketNo;
    private String basketUser;
    private int basketItem;
    private Date basketTime;
    private int basketQty;
	
    public int getBasketNo() {
		return basketNo;
	}
	public void setBasketNo(int basketNo) {
		this.basketNo = basketNo;
	}
	public String getBasketUser() {
		return basketUser;
	}
	public void setBasketUser(String basketUser) {
		this.basketUser = basketUser;
	}
	public int getBasketItem() {
		return basketItem;
	}
	public void setBasketItem(int basketItem) {
		this.basketItem = basketItem;
	}
	public Date getBasketTime() {
		return basketTime;
	}
	public void setBasketTime(Date basketTime) {
		this.basketTime = basketTime;
	}
	public int getBasketQty() {
		return basketQty;
	}
	public void setBasketQty(int basketQty) {
		this.basketQty = basketQty;
	}
}
