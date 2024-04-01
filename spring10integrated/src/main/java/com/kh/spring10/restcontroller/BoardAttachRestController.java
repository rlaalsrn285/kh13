package com.kh.spring10.restcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring10.service.AttachService;

//summernote를 이용해서 업로드되는 파일에 대한 처리를 수행하는 컨트롤러
@CrossOrigin
@RestController
@RequestMapping("/rest/board_attach")
public class BoardAttachRestController {
	
	@Autowired
	private AttachService attachService;
	
	//업로드 매핑
	//- 사용자가 summernote를 이용해서 드래그 또는 선택한 이미지들을 업로드
	//- 업로드가 완료되면 summernote가 이미지를 표시할 수 있도록 이미지 번호를 반환
	@PostMapping("/upload")
	public List<Integer> upload(@RequestParam List<MultipartFile> attachList) throws IllegalStateException, IOException {
		//올린 파일이 없으면 중지
		if(attachList.isEmpty()) return null;
		
		List<Integer> numbers = new ArrayList<>();
		for(MultipartFile attach : attachList) {
			int attachNo = attachService.save(attach);
			numbers.add(attachNo);
		}
		return numbers;
	}
	
}







