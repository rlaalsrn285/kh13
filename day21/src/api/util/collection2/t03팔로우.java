package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class t03팔로우 {

	public static void main(String[] args) {
			Scanner scsc = new Scanner(System.in);
			Set<String> f = new HashSet<>();
			String input = "피카츄";
			while(true) {
				System.out.println("아이디입력");
				input = scsc.next();
				if(input.equals("종료")) {
					System.out.println("나가기완료");
					break;
				}
				else if(f.add(input)) {
					f.add(input);
					System.out.println("팔로우 설정");
				}
				else if(f.add(input) == false) {
					f.remove(input);
					System.out.println("팔로우 삭제");
				}
			}
			System.out.println("리스트"+f);
	}

}
