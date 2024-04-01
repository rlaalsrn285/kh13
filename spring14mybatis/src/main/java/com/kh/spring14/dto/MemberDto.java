package com.kh.spring14.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberDto {

	private String memberId;//회원아이디
	private String memberPw;//회원비밀번호
	private String memberNick;//회원닉네임
	private String memberBirth;//회원생년월일
	private String memberContact;//회원연락처
	private String memberEmail;//회원이메일
	private String memberPost;//주소(우편번호)
	private String memberAddress1;//주소(기본주소)
	private String memberAddress2;//주소(상세주소)
	private String memberLevel;//회원등급(일반회원/우수회원/관리자)
	private int memberPoint;//회원포인트
	private Date memberJoin;//가입일시
	private Date memberLogin;//로그인일시
}
