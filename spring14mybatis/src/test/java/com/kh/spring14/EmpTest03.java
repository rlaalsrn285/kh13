package com.kh.spring14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest03 {

	@Autowired
	private EmpDao eeDao;
	
	@Test
	public void test() {
		
		Map<String, String> qqq = new HashMap<>();
		
		qqq.put("kkk","empName");
		qqq.put("vvv", "또도가스");
		
		List<EmpDto> list = eeDao.selectList(qqq);
		
		for(EmpDto eee : list) {
			log.debug("empdto = {}" , eee);
		}
	}
}
