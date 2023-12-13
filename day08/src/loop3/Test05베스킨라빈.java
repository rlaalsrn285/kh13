package loop3;

import java.util.Scanner;

public class Test05베스킨라빈 {

	public static void main(String[] args) {
		
		Scanner rere =	new Scanner(System.in);
		int n = 1; 			//현재숫자
		
		while(n <=31) {
			System.out.println("1~3숫자입력");
			System.out.println(n);
			int num = rere.nextInt();
			n = n + num;
		}System.out.println("너 패배");
		//countinue 다시반복문을 시작해라 아래코드실행안되고 위로다시올라감
		
	}

}
