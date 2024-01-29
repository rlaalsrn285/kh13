package com.kh.spring11.dto;

import java.sql.Date;

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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public String getMemberBirthStr() {
		if(memberBirth == null) 
			return "";
		else 
			return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberContact() {
		return memberContact;
	}
	public String getMemberContactStr() {
		if(memberContact == null)
			return "";
		else 
			return memberContact;
	}
	public void setMemberContact(String memberContact) {
		this.memberContact = memberContact;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPost() {
		return memberPost;
	}
	public String getMemberPostStr() {
		if(memberPost == null)
			return "";
		else 
			return memberPost;
	}
	public void setMemberPost(String memberPost) {
		this.memberPost = memberPost;
	}
	public String getMemberAddress1() {
		return memberAddress1;
	}
	public String getMemberAddress1Str() {
		if(memberAddress1 == null)
			return "";
		else
			return memberAddress1;
	}
	public void setMemberAddress1(String memberAddress1) {
		this.memberAddress1 = memberAddress1;
	}
	public String getMemberAddress2() {
		return memberAddress2;
	}
	public String getMemberAddress2Str() {
		if(memberAddress2 == null)
			return "";
		else 
			return memberAddress2;
	}
	public void setMemberAddress2(String memberAddress2) {
		this.memberAddress2 = memberAddress2;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public Date getMemberJoin() {
		return memberJoin;
	}
	public void setMemberJoin(Date memberJoin) {
		this.memberJoin = memberJoin;
	}
	public Date getMemberLogin() {
		return memberLogin;
	}
	public String getMemberLoginStr() {
		if(memberLogin == null)
			return "";
		else 
			return memberLogin.toString();
	}
	public void setMemberLogin(Date memberLogin) {
		this.memberLogin = memberLogin;
	}
	public MemberDto() {
		super();
	}
}
