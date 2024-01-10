package jdbc.app;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class T03메뉴수정 {

	public static void main(String[] args) {
		
		MenuDto dto = new MenuDto();
		dto.setMenuNo(2);
		dto.setMenuNameKor("아메리카노");
		dto.setMenuNameEng("Americano");
		dto.setMenuType("커피");
		dto.setMenuPrice(2500);
		
		MenuDao dao = new MenuDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("메뉴 정보 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴 번호");
		}
	}

}
