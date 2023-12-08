package condition2;

import java.util.Scanner;

public class Test03여행사프로모 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner (System.in);
		System.out.println ("인원수");
		int a = scsc.nextInt();  				//인원수
		System.out.println ("일수");
		int b = scsc.nextInt(); 					//일수
		System.out.println ("몇월");
		int c = scsc.nextInt();					//몇월
		int d = 10; 				//가격
		
		int e = a*b*d; 				//원가
		int qq;  						//변수선언 할인율을 위한
		
		
		if ( c >= 3 && c >= 5) {
			qq = 20;
			double f = (double)e - ( e 	* (qq/100d)  ); //할인적용금액
			int aa = (int)f;  //정수 형볗놘
			System.out.println (aa);
			
		}else if (c == 12 || c ==1 || c == 2){
			qq = 5;
			double f = (double)e - ( e 	* (qq/100d)  ); //할인적용금액
			int aa = (int)f;  //정수 형볗놘
			System.out.println (aa);
		
		}else if (c <= 8) {
			qq = 10;
			double f = (double)e - ( e 	* (qq/100d)  ); //할인적용금액
			int aa = (int)f;  //정수 형볗놘
			System.out.println (aa);
			
		}else {
			qq = 30;
			double f = (double)e - ( e 	* (qq/100d)  ); //할인적용금액
			int aa = (int)f;  //정수 형볗놘
			System.out.println (aa);
		}

	}

}
//오답 다시할것

