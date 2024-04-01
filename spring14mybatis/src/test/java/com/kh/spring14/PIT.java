package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.PocketmonDao;
import com.kh.spring14.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PIT {
	
	@Autowired
	private PocketmonDao pDao;
	
	@Test
	public void test1() {
		PocketmonDto pDto = new PocketmonDto();
		
		pDto.setPocketmonName("피죤투");
		pDto.setPocketmonNo(77);
		pDto.setPocketmonType("돌덩어");
		
		pDao.insert(pDto);
		log.debug("등록성공");
		
	}
}
