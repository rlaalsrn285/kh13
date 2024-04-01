package com.kh.spring10.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

//application.properties에 작성된 custom.email.어쩌구 설정을 담아두는 파일
@Service
@ConfigurationProperties(prefix = "custom.email")
public class EmailProperties {
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
