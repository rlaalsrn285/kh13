package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.EmpDto;
import jdbc.dto.MenuDto;
import jdbc.util.jdbcHelper;

public class MenuDao {
	
	public void insert(MenuDto dto) {
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "insert into menu("
							+ "menu_no, menu_name_kor, menu_name_eng, "
							+ "menu_type, menu_price"
						+ ") "
						+ "values(menu_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {
			dto.getMenuNameKor(), dto.getMenuNameEng(),
			dto.getMenuType(), dto.getMenuPrice()
		};
		jdbcTemplate.update(sql, data);
	}
	
	public boolean update(MenuDto dto) {
		JdbcTemplate jdbctt = jdbcHelper.getJdbcTemplate();
		String sql = "update menu "
				+ "set "
				+ "menu_name_kor=?, menu_name_eng=?,"
				+ "menu_type=?, menu_price=? "
				+ "where menu_no=?";
		
		Object[] datta = {
				dto.getMenuNameKor(), dto.getMenuNameEng(),
				dto.getMenuType(), dto.getMenuPrice(),
				dto.getMenuNo()
		};
		
		
		return jdbctt.update(sql,datta) > 0 ;
	}
	
	public boolean delete(int menuNo) {
		JdbcTemplate jTT = jdbcHelper.getJdbcTemplate();
		String sqlaa = "delete menu where menu_no=?";
		Object[] dtaa = {menuNo};
		
		
		return jTT.update(sqlaa,dtaa) > 0 ;
	}
}

