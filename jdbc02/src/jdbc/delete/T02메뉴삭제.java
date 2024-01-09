package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.jdbcHelper;

public class T02메뉴삭제 {

	public static void main(String[] args) {

		JdbcTemplate qwe = jdbcHelper.getJdbcTemplate();
		
		int mN = 1;
		String dddd = "delete menu where menu_no=?";
		Object[] obob= new Object[] {mN};
		
		
		int aaass = qwe.update(dddd,obob);
		
		if(aaass >0) {
			System.out.println("성공");
		}
		else{
			System.out.println("해당메뉴없음");
		}
	}
}
