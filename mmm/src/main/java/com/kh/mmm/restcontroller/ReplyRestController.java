package com.kh.mmm.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.mmm.dao.ReplyDao;
import com.kh.mmm.dto.ReplyDto;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/rest/reply")
public class ReplyRestController {

	@Autowired
	private ReplyDao replyDao;
	
	@PostMapping("/list")
	public List<ReplyDto> list(@RequestParam int replyOrigin) {
		return replyDao.selectList(replyOrigin);
	}
	@PostMapping("/delete")
	public void delete(@RequestParam int replyNo) {
		replyDao.delete(replyNo);
	}
	@PostMapping("/insert")
	public void insert(@ModelAttribute ReplyDto replyDto, HttpSession session) {
		String loginId = (String)session.getAttribute("loginId");
		int sequence = replyDao.sequence();
		
		replyDto.setReplyWriter(loginId);
		replyDto.setReplyNo(sequence);
		
		replyDao.insert(replyDto);
	}
}
