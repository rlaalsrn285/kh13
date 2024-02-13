package com.kh.mmm.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.mmm.dao.AttachDao;
import com.kh.mmm.dto.AttachDto;

@Service
public class AttachService {

	@Autowired
	private AttachDao attachDao;
	
	//파일저장 + DB저장
	public int save(MultipartFile attach) throws IllegalStateException, IOException {
		int attachNo = attachDao.getSequence();//시퀀스생성
		File dir = new File(System.getProperty("user.home"), "upload");
		dir.mkdirs();//폴더가 없다면 생성(있으면 pass)
		File target = new File(dir, String.valueOf(attachNo));
		attach.transferTo(target);//실물파일저장
		
		AttachDto attachDto = new AttachDto();
		attachDto.setAttachNo(attachNo);
		attachDto.setAttachName(attach.getOriginalFilename());
		attachDto.setAttachType(attach.getContentType());
		attachDto.setAttachSize(attach.getSize());
		attachDao.insert(attachDto);//DB저장
		
		return attachNo;
	}
	
	//파일삭제 + DB삭제
	public void remove(int attachNo) {
		//실제파일삭제
		File dir = new File(System.getProperty("user.home"), "upload");
		File target = new File(dir, String.valueOf(attachNo));
		target.delete();
		attachDao.delete(attachNo);//파일정보지우고
	}
}
