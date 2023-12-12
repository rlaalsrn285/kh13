package random;

import java.util.Random;
import java.util.Scanner;

public class 숙제3 {

	public static void main(String[] args) {
		Random rn = new Random ();
		Scanner inin = new Scanner(System.in);
		
	
		int qq = 0;        		//10점짜리 정답수
		int ww = 0;			//15점짜리 정답수
		int aaa = 10;  			//쉬운문제 점수
		int bbb = 15;				//어려운문제 점수
		for(int i=1; i <=10; i++) {
			int a = rn.nextInt(18)+2;
			int b = rn.nextInt(18)+2;
			System.out.println(a +"*" + b);
			System.out.println("정답입력");
			int c = inin.nextInt();
			if((a >=2 && a <=11) || b ==1){
				if (a*b == c) {
					System.out.println("정답");
					qq++;
				}else {
					System.out.println("오답");
			}
	}else {
		if (a*b == c) {
			System.out.println("정답");
			ww++;
		}else {
			System.out.println("오답");
	}
		}
			
}			System.out.println ("쉬운문제" + qq + "개" +"어려운문제" + ww);
			System.out.println ((aaa*qq)+(bbb*15) +"점" );
}		
}
//테스트해봣는데 집에너무가고싶어서 한번만해봣습니다..
//잘짯는지는 아직잘모르겟습니다