package data;

public class Test04자료형 {

	public static void main(String[] args) {
		//자료형이란
		//데이터를 저장하기위해 구분하는방법
		//숫자는 정수 ,실수
		//속도를위해 여러형태를 미리 정해둠
		//정수 :  btye , short , int , long 4가지로 구성
		//실수 : float , double 2가지
		//정수는 int , 실수는 double 을 기본으로 사용 , 특수한경우의 위다른것들을 사용
		//int , double 을 기본으로사용하니 우선기억
		
		//int = 111333333; 는 안된다 비트초과?암튼 범위초과
		long b = 111111111133L;
		
		System.out.println(b);
		//byte,int,long 을 주로사용하고 short는 거의 사용안함
		//기본적으로 int사용 초과하면 long
		//계산한결과값이 일정수를 넘어가면 뒤집힘(순환하다) 라고함 (다시찾아볼것)
		//int는 대략 21억까지 , long 은 대략900경 그보다 높은수의 해결법은 나중에 알아볼것
		//long 을사용할땐 L을붙일것
		
		//정수의 계산결과는정수가나옴(정수와 실수의 데이터가 다르기때문)나눗셈도
		//정수 10 나누기 3해버리면 3이나옴 3.333이 아니라 %를사용해서 나머지로 따로사용 
		

	

	}

}
