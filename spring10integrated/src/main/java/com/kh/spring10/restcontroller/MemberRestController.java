package com.kh.spring10.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.CertDao;
import com.kh.spring10.dao.MemberDao;
import com.kh.spring10.dto.CertDto;
import com.kh.spring10.dto.MemberDto;
import com.kh.spring10.service.EmailService;

//회원에서 필요한 비동기 작업을 처리하는 서버측 도구
@CrossOrigin
@RestController
@RequestMapping("/rest/member")
public class MemberRestController {

	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/checkId")
	public String checkId(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto == null) {
			return "NNNNY";//사용 가능한 경우(DB에 없는 경우)
		}
		else {
			return "NNNNN";//사용 불가능한 경우(DB에 있는 경우)
		}
	}
	
	@PostMapping("/checkMemberNick")
	public boolean checkMemberNick(@RequestParam String memberNick) {
		MemberDto memberDto = memberDao.selectOneByMemberNick(memberNick);
		return memberDto == null;
	}
	
	//이메일 인증을 위한 페이지
	//[1] 이메일을 전달받아 인증번호를 발송하는 페이지
	//[2] 인증번호를 전달받아 올바른 인증번호인지 판정하는 페이지
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/sendCert")
	public void sendCert(@RequestParam String memberEmail) {
		//emailService를 이용해서 인증번호를 보내는 코드
		emailService.sendCert(memberEmail);
	}
	
	@Autowired
	private CertDao certDao;
	
	@RequestMapping("/checkCert")
	public boolean checkCert(@ModelAttribute CertDto certDto) {
		boolean isValid = certDao.checkValid(certDto);
		if(isValid) {//인증 성공 시 인증번호 삭제
			certDao.delete(certDto.getCertEmail());
		}
		return isValid;
	}
}







