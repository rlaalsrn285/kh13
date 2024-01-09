package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class T02JDBC연결book {

	public static void main(String[] args) {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUsername("kh13");
		source.setPassword("kh13");
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		String jjj ="INSERT INTO BOOK(book_id,"
				+ " book_title, book_author, book_publication_date, "
				+ "book_price, book_publisher, book_page_count, book_genre)"
				+ "values(50,'자바신공','열혈강사','2023-10-01',5,'wikidocs','199','Education')";
		
		JdbcTemplate asd = new JdbcTemplate(source);  //실행도구임
		
		asd.update(jjj);
		System.out.println("aaa");
		
		//"oracle.jdbc.OracleDriver"
		//jdbc:oracle:thin:@localhost:1521:xe
	}

}
