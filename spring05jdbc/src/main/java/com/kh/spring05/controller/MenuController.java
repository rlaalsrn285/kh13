package com.kh.spring05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.MenuDao;
import com.kh.spring05.dto.EmpDto;
import com.kh.spring05.dto.MenuDto;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuDao dao;
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute MenuDto dto) {
		dao.insert(dto);
		return "메뉴 등록완료";
	}
	@RequestMapping("/change")
	public String change(@ModelAttribute MenuDto dto) {
		boolean r = dao.change(dto);  // <-이거 그냥 if(dao.change(dto) ) 로 없앨수잇음
		if(r) {
			return "메뉴수정완료";
		}
		else {
			return "없는 메뉴번호";
		}
	} //연습용 주소 /menu/change?menuNameKor=김치찌개&menuNameEng=kimzzi&menuType=한식&menuPrice=8888&menuNo=3

	@RequestMapping("/delete")
	public String delete(@RequestParam int menuNo) {
		if(dao.delete(menuNo)) {
			return "메뉴삭제완료";
		}
		else {
			return "없는메뉴번호";
		}
		//연습용 주소 : /menu/delete?menuNo=3
	}

	@RequestMapping("/list")
	public String list(
			@RequestParam(required = false) String column,
			@RequestParam(required = false) String keyword
			) {
		boolean isSearch = column != null && keyword != null;
		List<MenuDto> listt;
		
		if(isSearch) {
			listt=dao.selectList(column, keyword);
		}
		else {
			listt=dao.selectList();
		}
		StringBuffer sbsb = new StringBuffer();
		for(MenuDto dtdto : listt) {
			sbsb.append(dtdto.getMenuNo());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getMenuNameKor());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getMenuNameEng());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getMenuType());
			sbsb.append("ㅡ");
			sbsb.append(dtdto.getMenuPrice());
			sbsb.append("<br>"+"<br>");
		}
		return sbsb.toString();
		//연습용주소 /menu/list?column=menu_name_kor&&keyword=치
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int menuNo) {
		MenuDto dtdto = dao.selectOne(menuNo);
		if(dtdto  != null) {
			StringBuffer bfbf = new StringBuffer();
			bfbf.append(dtdto.toString());
			return bfbf.toString();
		}
		else {
			return "없는메뉴";
		}
		//연습용 주소 /menu/detail?menuNo=3
	}
}	
	
	

	
		
	

////연습용주소 /menu/insert?menuNameKor=김볶밥&menuNameEng=kimbokbab&menuType=분식&menuPrice=9999