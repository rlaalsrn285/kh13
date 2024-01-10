package jdbc.app;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class T01포켓몬등록 {
public static void main(String[] args) {

	
	//입력을 여기서 받고
	PocketmonDto dto = new PocketmonDto();
	dto.setPocketmonNo(112);
	dto.setPocketmonName("테스트몬");
	dto.setPocketmonType("테스트");
	
	//처리는 dao에 미리작성해둔걸 가져오는데 dao를 처리하려면 dto가 필요하니 불러옴
	PocketmonDao dao = new PocketmonDao();
	dao.insert(dto);
	
	//출력
	System.out.println("포켓몬스터 등록 완료");
	
}
}
