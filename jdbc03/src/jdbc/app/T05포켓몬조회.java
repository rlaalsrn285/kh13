package jdbc.app;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class T05포켓몬조회 {

	public static void main(String[] args) {
				
		int pocketmonNo = 7;
				
				PocketmonDao dao = new PocketmonDao();
				PocketmonDto dto = dao.selectOne(pocketmonNo);
				
				System.out.println(dto);
	}
}
