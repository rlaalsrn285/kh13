package jdbc.app;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class T03포켓몬수정 {

	public static void main(String[] args) {

		PocketmonDto dtoo =  new PocketmonDto();
		
		dtoo.setPocketmonNo(1);
		dtoo.setPocketmonName("바꾼");
		dtoo.setPocketmonType("바꾼타");
		
		PocketmonDao daoo = new PocketmonDao();
		boolean result = daoo.update(dtoo);
		
		if(result) {
			System.out.println("사원 변경완");
		}
		else {
			System.out.println("사원 변경실패");
		}
	}
}
