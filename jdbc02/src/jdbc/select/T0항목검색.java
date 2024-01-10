package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.jdbcHelper;

public class T0항목검색 {

	public static void main(String[] args) {


		JdbcTemplate jdbcTemmm = jdbcHelper.getJdbcTemplate();  //디비연결객체 불러옴
		
		
		
		String columnn = "pocketmon_name";  //번호 입력받고 변수미리만들어도스위치로 입력받은걸 밑에넣으란건가?
		String keywordd = "해씨";
		
		PoketmonMapper Mapperr = new PoketmonMapper();   // 옮겨담은 객체 만들고
		
		String sqll = "select * from pocketmon where instr("+columnn+",?) >0";
		Object[] data = {keywordd};
		
		List<poketmonDto> list = jdbcTemmm.query(sqll, Mapperr, data);
		
		if(list.isEmpty()) {
			System.out.println("검색 결과가 없습니다");
		}
		else {
			for(poketmonDto dto : list) {
				
				System.out.println("이름:"+dto.getPoName());
				System.out.println("번호:"+dto.getPoNo());
			
	
			}
		}
		
		
		
		
		
		
	}

}
