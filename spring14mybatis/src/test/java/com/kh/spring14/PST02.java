package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.PocketmonDao;
import com.kh.spring14.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PST02 {
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	@Test
	public void test() {
		int pocketmonNo = 66;
		PocketmonDto dto = pocketmonDao.selectOne(pocketmonNo);
		log.debug("dto = {}" , dto);
	}
}
