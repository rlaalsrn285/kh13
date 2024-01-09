package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class T05메뉴 {

	public static void main(String[] args) {
		
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUsername("kh13");
		source.setPassword("kh13");
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		Scanner scsc = new Scanner(System.in);
		
		System.out.println("<not null>메뉴 한글이름 20이하");
		String menuNameK = scsc.nextLine();
		System.out.println("<not null>메뉴 영어 60자이하");
		String menuNameE = scsc.nextLine();
		System.out.println("<not null> 메뉴종류한글10자,영어30자 이하");
		String menuType = scsc.nextLine();
		System.out.println("<not null>0원이상 입력");
		int  menuPrice = scsc.nextInt();
		
		Object[] dtdt = new Object[] {menuNameK,menuNameE,menuType,menuPrice};
		
		String www = "insert into menu(menu_no,menu_name_kor,"
				+ "menu_name_eng,menu_type,menu_price)"
				+ "values(menu_seq.nextval,?,?,?,?)";
		
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		JdbcTemplate shshsh = new JdbcTemplate(source);
		shshsh.update(www,dtdt);
		
		System.out.println("aaaaa");
		
		
	}

}
