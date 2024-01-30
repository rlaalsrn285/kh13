package com.kh.spring11.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.spring11.interceptor.AdminInterceptor;
import com.kh.spring11.interceptor.MemberInterceptor;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

	@Autowired
	private MemberInterceptor memberInterceptor;
	
	@Autowired
	private AdminInterceptor adminInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(memberInterceptor)
		.addPathPatterns("/member/**")
		.excludePathPatterns(
				//"/member/join", "/member/joinFinish",
				"/member/join*",
				"/member/login", "/member/exitFinish"
		);

		//관리자 인터셉터 등록
		//registry.addInterceptor(adminInterceptor)
		//			.addPathPatterns("/admin/**");

		
	}
	
	
}
