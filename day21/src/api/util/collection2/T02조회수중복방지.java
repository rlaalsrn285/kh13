package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T02조회수중복방지 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		// a.equals("종료")
		Set<String> hs = new HashSet<>();
		String a; // 입력변수선언

		while (true) {
			System.out.println("제목 입력하세");
			a = scsc.nextLine(); // 사용자입력 , 이거 Line 썻어야햇는데 버릇처럼 그냥next씀 Line써야함 next를위에쓴게아니니 청소용필요없
			boolean aaa = hs.contains(a);

			if (a.equals("종료")) { //hs.add(a) 의 결과값이 true false로 나옴 바로도가능 , 종료를 나중에넣어서 종료를 제대로못햇음 기억해둘것
				break;
			} else if (!aaa) {
				System.out.println("조회수+1 영상재생");
				hs.add(a);
			} else if (aaa) {
				System.out.println("영상만재생");
			}
		}
		System.out.println("종료" + hs.size());
	}

}
