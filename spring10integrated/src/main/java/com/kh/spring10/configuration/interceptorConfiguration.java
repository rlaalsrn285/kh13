package com.kh.spring10.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.spring10.interceptor.Memberinterceptor;
import com.kh.spring10.interceptor.Testinterceptor;

@Configuration
public class interceptorConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private Memberinterceptor mminter;
	
	/*@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(mminter).*/
		
	}



