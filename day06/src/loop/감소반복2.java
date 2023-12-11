package loop;

import java.util.Scanner;

public class 감소반복2 {

	public static void main(String[] args) {
		Scanner qq = new Scanner (System.in);
		
		System.out.println ( "분 입력");
		int a = qq.nextInt();		//분
		System.out.println ( "초 입력");
		int b = qq.nextInt();			//초
		int c = a*60 + b    ;		//초환산
		
		for(int d = c ;  d>=0 ; d-- ) {
			int e = d/60;  		//남은시간 분
			int f = d%60; 		//남은시간 초
			System.out.println (e + "분" + f + "초" );
			
		} 
		System.out.println ( "땡");
	}

}
