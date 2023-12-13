package loop3;

import java.util.Random;
import java.util.Scanner;

public class 모래성게임 {

	public static void main(String[] args) {
		Random rr = new Random();
		Scanner srsr = new Scanner(System.in);
		int hp = 100;
		
		while(hp >= 1) {
			System.out.println("현재체력"+hp);
			System.out.println("1~9숫자입력");
			int num = srsr.nextInt();
			hp -=num;
			int heal = rr.nextInt(4) +1;
			if(heal ==1) {
				hp +=20;
				System.out.println("<25퍼확률로 체력20회복>" );
			}
			
		}System.out.println("패배");

	}

}
