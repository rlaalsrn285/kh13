package loop3;

import java.util.Scanner;

public class Test05베스킨라빈2 {

	public static void main(String[] args) {
		
		Scanner rere =	new Scanner(System.in);
		int n = 0; 			//현재숫자
		
		while(n <=31) {
			System.out.println("1~3숫자입력");
			int num = rere.nextInt();
			switch(num) {
			case 1:System.out.println(n+1);
			break;
			case 2: System.out.println(n+1);
							System.out.println(n+2);
							break;
			case 3: 	System.out.println(n+1);	
							System.out.println(n+2);
							System.out.println(n+3);
							break;
							//for문으로도 가능 생각해볼것
			}
			
			n = n + num;
		}System.out.println("너 패배");

	}

}
