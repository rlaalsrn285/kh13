package loop;

import java.util.Scanner;

public class 연습용2 {

	public static void main(String[] args) {
		Scanner qwqw = new Scanner(System.in);
		System.out.println ("수 입력");
		int num = qwqw.nextInt();  //입력받을 수
		int count = 0;
		
		for (int i=1; i <=num ; i++) {
			if (num%i == 0) {
				count++;
				System.out.println (i);
			}
		}
		if(count ==2) {
			System.out.println ("소수입니다");
		}
		System.out.print("총"+count);
	}

}
