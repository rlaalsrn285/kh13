package com.kh.spring10.interceptor;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//특정 주소(URL)에 대한 처리 과정을 간섭할 수 있는 객체
//인터셉터는 특별한 처리를 수행하기 때문에 만드는 방법이 정해져 있다
//[1] 상속을 통해 자격요건을 획득한다 (HandlerInterceptor)
//[2] 스프링에 등록한다
//[3] 간섭 메소드를 재정의하여 내용을 작성한다
// 	- preHandle 메소드는 컨트롤러가 실행되기 전 시점을 간섭할 수 있다
// 		- true를 반환하면 통과, false를 반환하면 차단 
//	- postHandler 메소드는 컨트롤러가 실행된 후 시점을 간섭할 수 있다
//		- 화면은 아직 만들어지지 않은 상황
//		- preHandler과 다르게 컨트롤러에서 추가한 Model과 화면 정보 확인 가능
//		- 진행상황에 대한 모니터링을 수행할 수 있는 메소드
// 	- afterCompletion 메소드는 화면까지 모두 완성된 후 시점을 간섭할 수 있다
//		- 진행 과정에서 발생한 예외(Exception) 정보를 확인할 수 있다
//		- 순수 자바에서 catch 블럭에 작성하던 코드를 이곳에 작성해도 된다
//		- 단, 보여지는 페이지를 변경할 수는 없다
@Service
public class TestInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("인터셉터 실행");
		return true;//통과
	}
	@Override
	public void postHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(modelAndView);
	}
	@Override
	public void afterCompletion(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler, 
			Exception ex)
			throws Exception {
		if(ex != null) {
			ex.printStackTrace();
		}
	}
}






