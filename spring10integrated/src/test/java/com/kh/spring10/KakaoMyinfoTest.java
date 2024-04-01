package com.kh.spring10;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

//[3] access_token을 이용해서 카카오에 이 사용자의 정보를 요청
@SpringBootTest
class KakaoMyinfoTest {

	@Test
	void contextLoads() throws URISyntaxException {
		RestTemplate template = new RestTemplate();
		
		String uri = "https://kapi.kakao.com/v2/user/me";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "Bearer 액세스토큰자리");
		
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(header);
		
		ResponseEntity<String> response = template.exchange(uri, HttpMethod.GET, entity, String.class);	
		System.out.println(response);
	}

}
