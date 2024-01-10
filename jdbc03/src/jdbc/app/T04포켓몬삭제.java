package jdbc.app;

import jdbc.dao.PocketmonDao;

public class T04포켓몬삭제 {

	public static void main(String[] args) {

		//데이터준비
		int pocketNo = 25;
		
		//처리
		PocketmonDao dadao = new PocketmonDao();
		boolean rrr = dadao.delete(pocketNo);
		
		//출력
		if(rrr) {
			System.out.println("포켓몬 삭제완");
		}
		else {
			System.out.println("존재없 번호");
		}
	}

}
