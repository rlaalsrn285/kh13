package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class T02JDBC연결book2 {

	public static void main(String[] args) {

		
		Scanner scsc = new Scanner(System.in);
		
		
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUsername("kh13");
		source.setPassword("kh13");
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		System.out.println("추가 입력");
		String jjj = scsc.nextLine();
		
				
		JdbcTemplate asd = new JdbcTemplate(source);
		
		asd.update(jjj);
		System.out.println("aaa");
		
		//"oracle.jdbc.OracleDriver"
		//jdbc:oracle:thin:@localhost:1521:xe
	}

}
