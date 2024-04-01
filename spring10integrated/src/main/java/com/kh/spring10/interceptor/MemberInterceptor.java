package com.kh.spring10.interceptor;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//회원 페이지에 대한 접근 허용 및 차단을 판정하여 처리하는 도구
@Service
public class MemberInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, 
											HttpServletResponse response, 
											Object handler)
			throws Exception {
		//인터셉터는 주어진 메소드 내에서 원하는 도구를 꺼내서 사용한다
		//- request는 사용자의 요청 정보가 담긴 객체 (HttpSession이 있음)
		//- response는 사용자에게 내보낼 정보가 담긴 객체
		//- handler는 실행될 예정인 컨트롤러 매핑정보가 담긴 객체
		
		HttpSession session = request.getSession();//세션객체를 꺼내고
		String loginId = (String)session.getAttribute("loginId");//사용자ID 추출
		
		if(loginId != null) {//회원이면
			return true;
		}
		else {//회원이 아니면
			//단순히 차단만 하는게 아니라 사용자에게 보여줄 화면을 준비
			//[1] 로그인 화면으로 강제이동(리다이렉트)
			response.sendRedirect("/member/login");
			
			//[2] HTTP 상태번호를 반환 (Unauthorized)
			//response.sendError(401);
			return false;
		}
	}
}




