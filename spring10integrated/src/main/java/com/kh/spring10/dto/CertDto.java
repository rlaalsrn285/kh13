package com.kh.spring10.dto;

import java.sql.Date;

public class CertDto {
	private String certEmail;
	private String certNumber;
	private Date certTime;
	
	public String getCertEmail() {
		return certEmail;
	}
	public void setCertEmail(String certEmail) {
		this.certEmail = certEmail;
	}
	public String getCertNumber() {
		return certNumber;
	}
	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}
	public Date getCertTime() {
		return certTime;
	}
	public void setCertTime(Date certTime) {
		this.certTime = certTime;
	}
	public CertDto() {
		super();
	}
}
