package jdbc.update;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jdbc.util.jdbcHelper;

public class T01포켓몬수정 {

	public static void main(String[] args) {

		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		
		
		int poNom = 22;
		String poN = "괴력괴력몬";
		String poT = "바위바위";
		
		String aaa = "update POCKETMON set"
				+ "POCKETMON_NAME =?"
				+ "POCKETMON_type =?"
				+ "where pocketmon_no=?";
		
		Object[] bbb = new Object[] {poN,poT,poNom};
	}

}
