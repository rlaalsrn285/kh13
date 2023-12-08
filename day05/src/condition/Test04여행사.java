package condition;

import java.util.Scanner;

public class Test04여행사 {

	public static void main(String[] args) {
		Scanner sfsf = new Scanner(System.in);
		
		System.out.println("인원수 입력");
		int a = sfsf.nextInt();						// 인원수
		System.out.println("일수 입력");
		int b = sfsf.nextInt();  					// 일수 2일은 1박2일 이니까 -1함
		System.out.println("몇월 일정인지 입력");
		int c = sfsf.nextInt(); 						//몇월인지
		
		int d = 20; 											//할인율
		int e = 10;											//1박 요금 2
		int bb = a * (b-1) * e; 					//할인 미적용 요금
		
		boolean aa = 6 <= c && c <=8;	//여름인지
		if (aa)/*여름할인될경우 */ {
					double cc = (double) bb - (bb	 *	 (d/100d)	  );			// 할인적용 요금
					
					int dd = (int)cc;  						//할인적용 요금 정수형변환 한것  (최종요금)
					System.out.println("여름할인적용" + dd);
		}
		
		else {
				System.out.println ( "할인미적용" + bb );
		}
		
	
		
	}

}
