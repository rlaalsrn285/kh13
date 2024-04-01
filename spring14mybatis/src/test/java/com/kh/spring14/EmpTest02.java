package com.kh.spring14;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest02 {
	
	@Autowired
	private EmpDao eeeDao;
	
	@Test
	public void test02() {
		List<EmpDto> list = eeeDao.selectList();
		log.debug("총합은 = {}", list.size());
	}
	
	@Test
	public void test03() {
		int empNo = 101;
		EmpDto dto = eeeDao.selectOne(empNo);
		log.debug("dto = {}" , dto);
	}
	


}
