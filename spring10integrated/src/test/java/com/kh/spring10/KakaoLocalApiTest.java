package com.kh.spring10;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

import org.junit.jupiter.api.Test;
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
public class KakaoLocalApiTest {
	
	@Test
	public void test() throws URISyntaxException, UnsupportedEncodingException, JsonMappingException, JsonProcessingException {
		RestTemplate template = new RestTemplate();
		
		String query = "서울특별시 영등포구 선유동2로 57";
		URI uri = new URI("https://dapi.kakao.com/v2/local/search/address.JSON?query="+URLEncoder.encode(query, "UTF-8"));
		
		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "KakaoAK 66ce7bd4abf2f89d68b0de0a8f1eedb1");
		
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(header);
		
		ResponseEntity<String> response = template.exchange(uri, HttpMethod.GET, entity, String.class);
		//System.out.println(response.getBody());
		
		ObjectMapper mapper = new ObjectMapper();
		KakaoLocalVO vo = mapper.readValue(response.getBody(), KakaoLocalVO.class);
		System.out.println(vo.getDocuments()[0].getX());
		System.out.println(vo.getDocuments()[0].getY());
	}
	
}
