package com.kh.spring10.vo;

//VO(Value Object)
//- 테이블과 똑같이 생긴 DTO와는 달리 자유롭게 변형된 형태로 사용하기 위한 클래스
//- 생성방식과 형태는 DTO와 동일
//- 조회하려면 Mapper가 필요
public class StatVO {
	private String title;
	private int count;
	public StatVO() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
