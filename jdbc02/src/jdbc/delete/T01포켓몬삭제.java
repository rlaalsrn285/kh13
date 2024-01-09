package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.jdbcHelper;

public class T01포켓몬삭제 {

	public static void main(String[] args) {
		
		int pocketmonNO = 7;
		
		JdbcTemplate ppp = jdbcHelper.getJdbcTemplate();
		
		String ssqql = "delete pocketmon where pocketmon_no=?";
				
			Object[] dddaa = new Object[] {pocketmonNO};
			int result = ppp.update(ssqql,dddaa);
			
			if(result > 0) {
				System.out.println("완료");
			}
			else {
				System.out.println("실패");
			}
		
	}

}
