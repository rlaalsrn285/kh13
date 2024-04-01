package com.kh.spring10.vo;

public class LikeVO {
	private boolean state;
	private int count;
	public LikeVO() {
		super();
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
