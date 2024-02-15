package com.kh.mmm.dto;

import java.sql.Date;

public class MemberDto {

	private String memberId;
	private String memberPw;
	private String memberNick;
	private String memberBirth;
	private String memberContact;
	private String memberEmail;
	private String memberPost;
	private String memberAddress1;
	private String memberAddress2;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin;
	private Date memberLogin;

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
