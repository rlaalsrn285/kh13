package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class T01JDBC연결 {
	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13");
		dataSource.setPassword("kh13");
		
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		String sql = "insert into pocketmon("
				+ "pocketmon_no,pocketmon_name,pocketmon_type) "
				+ "values(25,'피카츄츄','찌릿')";
		
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
	
		jdbcTemplate.update(sql);
		System.out.println("완료");
		
		
	}

}
