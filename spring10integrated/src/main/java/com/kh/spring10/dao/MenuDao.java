package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.MenuDto;
import com.kh.spring10.mapper.MenuMapper;

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
	
	//메뉴 수정
	public boolean change(MenuDto dto) {
		String sql = "update Menu set "
				+ "menu_name_kor=?,menu_name_eng=?,menu_type=?,menu_price=? "
				+ "where menu_no=?";
		Object[] data = new Object[] {
				dto.getMenuNameKor(),dto.getMenuNameEng(),dto.getMenuType(),dto.getMenuPrice(),dto.getMenuNo()
		};
		return jdbcTT.update(sql,data) > 0;
		
	}
	
	//메뉴삭제 
	public boolean delete(int menuNo) {
		String sql = "delete menu where menu_no=?";
		Object[] nono = {menuNo};
		return jdbcTT.update(sql,nono) > 0 ;
	}

	//리스트조회
	public List<MenuDto> selectList(){
			String sql = "select * from menu order by menu_no asc";
			return jdbcTT.query(sql,mapper);
		}
		
	//키워드 조회
	public List<MenuDto> selectList(String column,String keyword){
			String sql = "select * from menu where instr("+column+",?) > 0"
					+ " order by "+column+" asc, menu_no asc";
			
			Object[] data = {keyword};
			return jdbcTT.query(sql, mapper,data);
		}

	//상세조회
	public MenuDto selectOne(int menuNoNo) {
		String sql = "select * from menu where menu_no=?";
		Object[] data = new Object[]{menuNoNo};
		List<MenuDto> listtt = jdbcTT.query(sql, mapper,data);
		return listtt.isEmpty()? null : listtt.get(0);
		}
}
