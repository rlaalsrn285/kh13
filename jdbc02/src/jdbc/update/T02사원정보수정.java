package jdbc.update;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.jdbcHelper;

public class T02사원정보수정 {
	public static void main(String[] args) {
		
		JdbcTemplate bb = jdbcHelper.getJdbcTemplate();
		
		int menu_no =1;
		String menuNameK = "라면";
		String menuNameE = "rara";
		String menuType = "분분분식";
		int menu_price = 2500;
		
		String sqsq = "update menu set"
				+ " menu_no=?,menu_name_kor=?,menu_name_eng=?,menu_type=?"
				+ ",menu_price=?";
		
		Object[] ddd = new Object[]{menu_no,menuNameK,menuNameE,menuType,menu_price};
		bb.update(sqsq,ddd);
		
		System.out.println("asdf");
		
	}

}
