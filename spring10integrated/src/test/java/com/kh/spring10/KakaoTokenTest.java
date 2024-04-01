package com.kh.spring10;

import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

//[1] https://kauth.kakao.com/oauth/authorize에 접속해서 로그인
//[2] 로그인 성공 후 주소에 나오는 code값을 읽어서 access_token을 얻어내는 통신코드
@SpringBootTest
class KakaoTokenTest {

	@Test
	void contextLoads() throws URISyntaxException {
		RestTemplate template = new RestTemplate();
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("grant_type", "authorization_code");
		body.add("client_id", "내 카카오 앱의 Rest API 키");
		body.add("redirect_uri", "내 애플리케이션에 등록된 로그인 redirect 주소");
		body.add("code", "로그인 성공 후 주소에 있는 code값");
		
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, header);
		
		String uri = "https://kauth.kakao.com/oauth/token"; 
		
		Map map = template.postForObject(uri, entity, Map.class);	
		System.out.println(map);
	}

}
