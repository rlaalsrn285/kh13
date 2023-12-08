package condition2;

import java.util.Scanner;

public class Test01그룹조건 {

	public static void main(String[] args) {
		Scanner uiui = new Scanner (System.in);
		System.out.println("나이입력");
		int a = uiui.nextInt();  				//나이 입력
	
		if (a >=65) {System.out.println("노인 무료");
			
		}else if (20<= a && a <65) {
			System.out.println("성인 1400");
		}else if (14 <= a && a <20) {
			System.out.println("청소년 800");
		}else if (8 <= a && a <14) {
			System.out.println("어린이 500");
		}else {
			System.out.println("무료");
		}
	//완성은 잘했으나  무료인 노인,영유아를 or를1사용해서 한번에도 가능
		//첫질문에서 노인을 뺏기때문에 20<= a && a <65 -------나이 <=20 으로 확줄일수잇고,
		//나머지들도 위와같이 짧게할수있음
		//요점은 첫질문에 많은조건들을 빼버리면 나머지를 줄일수잇음
		/* 
		변수를 값을넣지말고 
		변수 선언만해서 가능
		조건문밖에서 변수를 선언하고
		조건문 마다 변수를 다르게 초기화

		int num;
		if (aa) {
		num = 0;
		} if else { 
		num = 500;
		} else {
		num = 1200;
		} 
		과 같이 변수를 선언만하고
		값을 지정하지않고 조건문마다다르게 초기화해서사용가능
		그리고 선언한변수를 반드시 사용해야함

		조건문을 나오면 */


	
		
	}
}