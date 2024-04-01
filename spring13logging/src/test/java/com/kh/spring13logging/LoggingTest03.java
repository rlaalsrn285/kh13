package com.kh.spring13logging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class LoggingTest03 {
	
	@Test
	public void test03() {
		
		int a= 5 ,  b = 10;
		log.debug("{} + {} = {}" , a , b, a+b);
		
	}

}
