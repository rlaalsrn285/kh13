package loop;

import java.util.Scanner;

public class 숙제용 {

	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		System.out.println ("단입력");
		
		int a = oo.nextInt();  			// 단입력
		for (int i = 1; i <= 9 ; i++) {
			System.out.println ( a + "*" + i);
			System.out.println ("정답입력");
		   int aa=oo.nextInt();	//정답입력
			
			boolean bb = (a*i == aa);
			
			if(bb) {
				System.out.println ("정답");
				
			}else {
				System.out.println ("오답");
			}
			System.out.println ("끝");
		}

	}

}
