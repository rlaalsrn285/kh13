package com.kh.spring14;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.PocketmonDao;
import com.kh.spring14.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PST01 {

	@Autowired
	private PocketmonDao pocketmonDao;
	
	@Test
	public void test() {
		List<PocketmonDto> list = pocketmonDao.selectList();
		log.debug("결과 수 : {}", list.size());
	}
}
