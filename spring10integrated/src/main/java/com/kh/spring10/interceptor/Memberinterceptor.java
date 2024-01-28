package com.kh.spring10.interceptor;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Service
public class Memberinterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession ss = request.getSession();
		String loginId = (String) ss.getAttribute("loginId");
		
		if(loginId != null) {
		return true;
		}
		else {
			response.sendRedirect("/member/login");
			return false;
		}
	}
}
