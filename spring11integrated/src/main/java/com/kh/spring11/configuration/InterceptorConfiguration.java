package com.kh.spring11.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import interceptor.AdminInterceptor;
import interceptor.MemberInterceptor;

@Configuration
public class InterceptorConfiguration {

	@Autowired
	private MemberInterceptor memberInterceptor;
	
	@Autowired
	private AdminInterceptor adminInterceptor;
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(memberInterceptor).addPathPatterns("/member/**").excludePathPatterns("/member/join*","/member/login", "/member/exitFinish");
		
				//관리자 인터셉터 등록
				//registry.addInterceptor(adminInterceptor)
				//			.addPathPatterns("/admin/**");
				//현재 이건 임시로막아둔듯 복붙해서 잘모름 
	}
}
