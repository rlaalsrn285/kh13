package com.kh.spring10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//스케쥴러 활성화
@SpringBootApplication
public class Spring10integratedApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring10integratedApplication.class, args);
	}

}
