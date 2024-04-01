package com.kh.spring14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ComplexSearchTest03 {

	
	@Autowired
	private  SqlSession sqlSession;
	
	@Test
	public void test() {
		
		String column = "member_id";
		String keyword = "test";
		
		Map<String, Object> data = new HashMap<>();
		//data.put("column", column);
		//data.put("keyword", keyword);
		
		List<MemberDto> lll = sqlSession.selectList("member.listOrSearch", data);
		
		for(MemberDto mmm : lll) {
			log.debug("member = {}", mmm);
		}
	}
}
