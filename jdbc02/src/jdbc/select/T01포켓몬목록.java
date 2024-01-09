package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.jdbcHelper;

public class T01포켓몬목록 {

	public static void main(String[] args) {
		JdbcTemplate asd =jdbcHelper.getJdbcTemplate();
				
		String sqsql = "select * from pocketmon";
		
		PoketmonMapper mapper11 = new PoketmonMapper();
		
		List<poketmonDto> llist = asd.query(sqsql,mapper11);
		
		
		System.out.println(llist.size());
		for(poketmonDto dto : llist) {
			System.out.println(dto.getPoName());
		}
		
	}

}
