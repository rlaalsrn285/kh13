package com.kh.spring11.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dao.PocketmonDao;
import com.kh.spring11.dto.MemberDto;
import com.kh.spring11.dto.PocketmonDto;

@CrossOrigin
@RestController
public class AjaxRestController {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private PocketmonDao pocketmonDao;
	

	
	@RequestMapping("/hello")
	public String hhh(){
		
		return "asdfasdf";
	}
	
	@RequestMapping("/checkId")
	public String checkId(@RequestParam String memberId) {
		MemberDto mmDto = memberDao.selectOne(memberId);
		
		if(mmDto == null) {
			return "oo";
		}
		else {
			return "xx";
		}
		
	}
	
	@RequestMapping("/checkPN")
	public String checkN(@RequestParam int pocketmonNo) {
		PocketmonDto ppdto = pocketmonDao.selectOne(pocketmonNo);
		
		if(ppdto == null) {
			return "ooo";
		}
		else{
			return "xx";
		}
	}
	
	@RequestMapping("/checkMemberNick")
	public String checkMN(@RequestParam String memberNick) {
		MemberDto memberDto = memberDao.selectOneByMemberNick(memberNick);
		
		if(memberDto == null) {
		return "okok";
		}
		else {
		return "nono";
		}
	}
}










