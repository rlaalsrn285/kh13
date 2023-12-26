package api.lang.object;

import java.util.Scanner;

public class T03로그인 {

	public static void main(String[] args) {
			
			String id = "khacademy";
			String pass = "adminuser";
			
			Scanner scsc = new Scanner(System.in);
			System.out.println("아이디입력");
			String a = scsc.next();
			System.out.println("비번입력");
			String b = scsc.next();
			
			boolean cc =id.equals(a) ;
			boolean bb = (pass.equals(b ));
			
			if (cc && bb) {
				System.out.println("로그인 성공");
				}
			else {
				System.out.println("로그인실패");
			}
	}

}
