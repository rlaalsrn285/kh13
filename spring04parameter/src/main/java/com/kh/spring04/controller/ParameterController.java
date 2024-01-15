package com.kh.spring04.controller;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {

	@RequestMapping("/plus")
	public String plus(int a, int b) {
		//주소예) http://localhost:8080/plus?a=10&&b=20 
		int r = a + b;
		return "구리구리"+ r;
	}
	//출생년도 8자리 입력 한국나이출력	
	@RequestMapping("koreanAge")
	public String kAge(String age) {
		age = "20000505";
		int ageint = Integer.parseInt(age);
		int aa = ageint/10000;
		
		LocalDate cDate = LocalDate.now();
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("yyyy");
		String cDY = cDate.format(ff);
		int bb = Integer.parseInt(cDY);
		int zzz = bb-aa;
		
		return "한국나이"+zzz;

	}
	
	// 키 체중 bmi반환
	@RequestMapping("/bmi")
	public String bmi(float h,float w) {
		
		float heightMeter = h / 100;
		float bmi = w / (heightMeter * heightMeter);
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		return "BMI : " + fmt.format(bmi);
	}

	// 더치페이계산기
	@RequestMapping("/dutch")
	public String dutch(
			@RequestParam(required = false, defaultValue ="0") int a,
			@RequestParam(required = false, defaultValue = "1") int people) {
		
		int r = a / people;
		return "한사람"+r;	
	}
	
	//주소이름 커피
	@RequestMapping("/coffee")
	public String coffee(
			@RequestParam(required = false, defaultValue = "americano") String kind,
			@RequestParam(required = false, defaultValue = "0") int shot
			) {
		
		
		return kind +"주문, 샷" + shot +"개";
	}
	
}
