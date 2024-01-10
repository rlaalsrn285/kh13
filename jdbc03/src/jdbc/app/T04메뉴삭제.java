package jdbc.app;

import jdbc.dao.PocketmonDao;

public class T04메뉴삭제 {

	public static void main(String[] args) {

		//데이터준비
		int afaf = 5;
		
		//처리
		PocketmonDao ddao = new PocketmonDao();
		boolean asd =ddao.delete(afaf);
		
		if(asd) {
			System.out.println("메뉴 삭제완");
		}
		else {
			System.out.println("메뉴 번호");
		}
		
	}

}
