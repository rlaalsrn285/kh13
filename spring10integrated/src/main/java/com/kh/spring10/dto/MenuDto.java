package com.kh.spring10.dto;

public class MenuDto {
	
	private int menuNo;
	private String menuNameKor;
	private String menuNameEng;
	private String menuType;
	private int menuPrice;
	
	
	@Override
	public String toString() {
		return "MenuDto [menuNo=" + menuNo + ", menuNameKor=" + menuNameKor + ", menuNameEng=" + menuNameEng
				+ ", menuType=" + menuType + ", menuPrice=" + menuPrice + "]";
	}
	public MenuDto() {
		super();
	}
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuNameKor() {
		return menuNameKor;
	}
	public void setMenuNameKor(String menuNameKor) {
		this.menuNameKor = menuNameKor;
	}
	public String getMenuNameEng() {
		return menuNameEng;
	}
	public void setMenuNameEng(String menuNameEng) {
		this.menuNameEng = menuNameEng;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	
	

}
