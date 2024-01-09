package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class T03데이터변수화 {

	public static void main(String[] args) {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUsername("kh13");
		source.setPassword("kh13");
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		int pocketmonNo= 22;
		String pocketmonName="괴력몬";
		String pocketmonType = "돌돌돌";
		
		String sll = "insert into pocketmon(pocketmon_no,pocketmon_name,pocketmon_type)"
				+ "values(?,?,?)";
		
		Object[] ddda = new Object[] {pocketmonNo,pocketmonName,pocketmonType};
		
		JdbcTemplate asd = new JdbcTemplate(source);  //실행도구임
		
		asd.update(sll,ddda);
		System.out.println("aaa");
				
	}

}
