package com.kh.spring13logging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class LoggingTest02 {

	@Test
	public void test() {
		
		for(int i=0; i < 100000; i++) {
			log.debug("HAHAHA!");
		}
	}
}
