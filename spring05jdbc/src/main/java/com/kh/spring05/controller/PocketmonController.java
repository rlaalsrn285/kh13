package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.PocketmonDao;
import com.kh.spring05.dto.PocketmonDto;

@RestController
@RequestMapping("/pocketmon")
public class PocketmonController {

	@Autowired
	private PocketmonDao dao;
	@Autowired
	private JdbcTemplate jdbcTT;
	//등록
	//더미데이터 주소 /insert?pNo=33&pName=꼬마돌&pType=돌돌
	@RequestMapping("/insert")
	public String insert(
			@RequestParam int pNo,
			@RequestParam String pName,
			@RequestParam String pType) {
		
		
		String sqll = "insert into pocketmon("
				+ "pocketmon_no,"
				+ "pocketmon_name,"
				+ "pocketmon_type)"
				+ "values(?,?,?)";
		
		Object[] data = {pNo,pName,pType};
		jdbcTT.update(sqll,data);
		
		return "포키몬등록완료";
	}

	// (dto)이용해서
	//Requsetparam 이아니라 model
	@RequestMapping("/insert2")
	public String insert2(PocketmonDto ddto) {
		
		String sqll = "insert into pocketmon("
				+ "pocketmon_no,"
				+ "pocketmon_name,"
				+ "pocketmon_type)"
				+ "values(?,?,?)";
		
		Object[] data = {ddto.getPocketmonNo(),ddto.getPocketmonName(),ddto.getPocketmonType()};
		jdbcTT.update(sqll,data);
		
		return "포키몬등록완료";
		
	}
	
	@RequestMapping("/insert3")
	public String insert3(@ModelAttribute PocketmonDto dto) {
		
		dao.insert(dto);
		return "포키 등록완료";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int poNo) {
		if(dao.delete(poNo)) {
			return "포키몬 삭제완";
		}
		else {
			return "포키몬 없는번호";
		}
	}
	
}
