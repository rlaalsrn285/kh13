package com.kh.spring10;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.spring10.vo.KakaoLocalVO;

@SpringBootTest
public class KakaoLocalApiTest2 {
	
	@Autowired
	private KakaoLocalService kakaoLocalService;
	
	@Test
	public void test() throws URISyntaxException, UnsupportedEncodingException, JsonMappingException, JsonProcessingException {
		String query = "서울특별시 영등포구 선유동2로 57";
		KakaoLocalVO vo = kakaoLocalService.search(query);
		System.out.println(vo.getDocuments()[0].getX());
		System.out.println(vo.getDocuments()[0].getY());
	}
	
}
