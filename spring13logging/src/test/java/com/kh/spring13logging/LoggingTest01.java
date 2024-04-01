package com.kh.spring13logging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class LoggingTest01 {
	
//	Logger loggg = LoggerFactory.getLogger(LoggingTest01.class);
	
	@Test
	public void test() {
		
		log.debug("디버그 메세지");	
		log.info("인포메세");
		log.warn("경고메세");
		log.error("오류메세");
		
		
	}

}
