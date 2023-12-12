package random;

import java.util.Random;

public class Test02랜덤생성 {

	public static void main(String[] args) {
		//랜덤도 뒤에숫자생략하면 0부터시작함 ex +1하면 1부터시작 아무것도없으면 0부터시작
		//컴퓨터는 0부터시작하는게 일반적으로 인식하니 0부터 시작해버릇할것
		Random rr = new Random();
		
		int b = rr.nextInt(45) +1;
		System.out.println("공번호"+b);
		
		int c = rr.nextInt(900000) +100000;
		System.out.println("otp"+c);
        // 9 + 1 하면1~9 까지 즉9개가 나옴 그럼 둘의합 -1 까지나온다는뜻
		//여섯자리면 일십백천만 십만/ 이므로 둘이합해서 100만이나오면되니 뒤에 10만 안에 90만
		int a = rr.nextInt(3) +1;
		switch(a) {
		case 1: System.out.println("가위");
		break;
		case 2: System.out.println("바위");
		break;
		case 3: System.out.println("보");
		break;
		}int dd = rr.nextInt(2) +1;
		if(dd==1) {
			System.out.println("홀");
		}else {System.out.println("짝");
			
		}
		
	}

}
