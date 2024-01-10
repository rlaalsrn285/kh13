package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class T03메뉴등록 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		MenuDto dto = new MenuDto();
		System.out.print("메뉴명(한글) : ");
		dto.setMenuNameKor(sc.nextLine());
		System.out.print("메뉴명(영문) : ");
		dto.setMenuNameEng(sc.nextLine());
		System.out.print("메뉴종류 : ");
		dto.setMenuType(sc.nextLine());
		System.out.print("메뉴가격 : ");
		dto.setMenuPrice(sc.nextInt());
		
		sc.close();
		
		//메뉴 등록
		MenuDao dao = new MenuDao();
		dao.insert(dto);
		
		//결과 출력
		System.out.println("메뉴가 등록되었습니다");
	}

}
