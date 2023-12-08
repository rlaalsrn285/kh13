package condition;

import java.util.Scanner;

public class 과속카메다시 {

	public static void main(String[] args) {
		
		Scanner asas = new Scanner(System.in);
		System.out.println("속도입력");
		int a = asas.nextInt();  //시속 입력
		
		boolean aa = (a>50);
		if(aa) {
			int b = 50;  						// 과속기준
			int c = 30000; 				//벌금 시작금액
			int d = 10000; 				//초과벌금단위
			int e = 10 ;   						//초과속도 단위
			
			int f 	= 	a - b; 						//과속한속도
			int g 	= f / e; 						// 추가과속 10이 몇개인가?
			int z 	= d*g;							//추가과속 10 횟수 * 추가벌금  = 총 추가벌금
			int h 	= c + z; 						// 벌금시작금액 + 추가벌금   = 총벌금
			
			System.out.println("초과대상"+h);
		}
		else {
			System.out.println("과속아님" + "0");
			}
	}

}
