package loop;

import java.util.Scanner;

public class Test04숫자입 {

	public static void main(String[] args) {
			int rrr = 0;
		for ( int aa = 1 ; aa <=8 ; aa+=2) {
			
			System.out.println("숫 입력");
			Scanner zxzx = new Scanner(System.in);
			int bb = zxzx.nextInt();
			rrr = rrr + bb;
		
			System.out.println ( aa + "번째"+"\"입력 숫"+ bb + "임");
		
			System.out.println ("누적" + rrr);
		}
		// 따옴표 넣으랫는데 안넣음 따옴표넣는법은 \" 쓰기
	}

}
