package com.kh.spring10.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//이미 만들어진 컨트롤러에서 발생하는 예외에 대한 처리를 수행하는 도구
//- 간섭 도구이며 AOP의 구현체 중 하나
//- 등록을 @ControllerAdvice로 하며, 옵션으로 대상을 반드시 지정해야 한다
//- 클래스 내에는 @ExceptionHandler를 만들어 예외를 종류별로 처리
//- 메소드 내에서 필요한 처리를 하고 보여주고 싶은 화면을 반환
//- 컨트롤러처럼 필요한 데이터를 선언하면 자동으로 전달해줌(세션,예외객체,..)

//@ControllerAdvice(basePackages = {"com.kh.spring10.controller"})
@ControllerAdvice(annotations = {Controller.class})
public class ErrorController {
	
	@ExceptionHandler(Exception.class)
	public String handler(Exception e) {
		//에러 정보를 콘솔이나 파일 등에 출력하는 코드
		e.printStackTrace();
		return "/WEB-INF/views/error.jsp";
	}
	
}




