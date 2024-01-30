package com.kh.spring11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring11.dao.BoardDao;
import com.kh.spring11.dto.BoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
	//게시글등록(insert)
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/board/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute BoardDto boardDto) {
		boardDao.insert(boardDto);
		return "redirect:insertFinish";
	}
	//게시글목록 
	@RequestMapping("/list")
	public String list(@RequestParam(required = false) String keykey,
			@RequestParam(required = false) String ccc,Model mm) {
		boolean isSearch = keykey != null;
		List<BoardDto> list = isSearch ? boardDao.selectList(ccc, keykey) : boardDao.selectList();
		mm.addAttribute("list", list);
		
		return "/WEB-INF/views/board/list.jsp";
		
		
	}
}
