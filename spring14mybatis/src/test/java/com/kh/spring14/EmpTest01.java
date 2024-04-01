package com.kh.spring14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dao.EmpDao;
import com.kh.spring14.dto.EmpDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpTest01 {
	
	@Autowired
	private EmpDao eeeDao;
	
	@Test
	public void test01() {
		EmpDto dtdto = new EmpDto();
		
		dtdto.setEmpNo(101);
		dtdto.setEmpName("또도가스");
		dtdto.setEmpDept("가스부서");
		dtdto.setEmpSal(500000);
		dtdto.setEmpDate("1999-10-10");
		
		eeeDao.insertt(dtdto);
		log.debug("EMP 등록성공");
	}

}
