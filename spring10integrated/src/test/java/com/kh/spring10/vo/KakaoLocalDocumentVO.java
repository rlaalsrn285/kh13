package com.kh.spring10.vo;

public class KakaoLocalDocumentVO {
	private KakaoLocalAddressVO address;
	private String address_name, address_type;
	private KakaoLocalRoadAddressVO road_address;
	private String x, y;
	public KakaoLocalAddressVO getAddress() {
		return address;
	}
	public void setAddress(KakaoLocalAddressVO address) {
		this.address = address;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public KakaoLocalRoadAddressVO getRoad_address() {
		return road_address;
	}
	public void setRoad_address(KakaoLocalRoadAddressVO road_address) {
		this.road_address = road_address;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
}
