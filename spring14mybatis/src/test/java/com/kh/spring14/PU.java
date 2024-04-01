package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.PocketmonDao;
import com.kh.spring14.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PU {

	@Autowired
	private PocketmonDao pocketmonDao;
	
	@Test
	public void test() {
		PocketmonDto pDto = new PocketmonDto();
		pDto.setPocketmonName("피죤투3");
		pDto.setPocketmonNo(77);
		pDto.setPocketmonType("비행타");
		
		if(pocketmonDao.update(pDto)) {
			log.debug("정보 변경성공임니다");
		}
		else {
			log.debug("없는대상");
		}
	}
}
