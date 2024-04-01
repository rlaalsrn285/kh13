package com.kh.spring10.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//이메일 시스템에서 사용할 도구를 등록하기 위한 설정파일
@Configuration//설정파일로 등록하는 구문
public class EmailConfiguration {
	
	@Autowired
	private EmailProperties emailProperties;
	
	@Bean//스프링 빈(객체)으로 등록하는 구문
	public JavaMailSenderImpl sender() {
		//이메일을 전송하려면 전송도구가 필요하다
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("smtp.gmail.com");//업체의 호스트정보
		sender.setPort(587);//업체의 포트 번호
		sender.setUsername(emailProperties.getId());//계정
		sender.setPassword(emailProperties.getPw());//비밀번호
		
		//통신과 관련된 추가 설정
		Properties props = new Properties();//자바에서 제공하는 문자열 Map
		props.setProperty("mail.smtp.auth", "true");//인증 후 이용 설정(필수)
		props.setProperty("mail.smtp.debug", "true");//디버깅 이용 설정(선택)
		props.setProperty("mail.smtp.starttls.enable", "true");//TLS 사용 설정(필수)
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");//TLS 버전 설정(필수)
		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");//신뢰할 수 있는 대상으로 설정(필수)
		sender.setJavaMailProperties(props);
		
		return sender;
	}
	
}
