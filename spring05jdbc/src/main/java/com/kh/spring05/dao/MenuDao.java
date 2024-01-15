package com.kh.spring05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.MenuDto;
import com.kh.spring05.mapper.MenuMapper;

@Repository
public class MenuDao {
	@Autowired
	private JdbcTemplate jdbcTT;
	
	@Autowired
	private MenuMapper mapper;
	
	//메뉴등록
	public void insert(MenuDto dto) {
		String sql = "insert into menu("
				+ "menu_no,menu_name_kor,menu_name_eng,menu_type,menu_price)"
				+ "values(menu_seq.nextval,?,?,?,?)";
		Object[] data = new Object[] {
				dto.getMenuNameKor(),dto.getMenuNameEng(),dto.getMenuType(),dto.getMenuPrice()
		};
		jdbcTT.update(sql,data);
	}

}
