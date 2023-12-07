package data4;

public class Test04숫자판정 {

	public static void main(String[] args) {
		// == 는 같다 라는뜻 
		int num = 73;
		int a = num/10; //첫째자리 확인
		int b = num%10; //둘째자리 확인
		
	
		boolean aa = a == 7;    //첫째자리에 7이들어가는지 true or false
		boolean bb = b==7;     //둘째자리에 7이 들어가는지 true of false
		boolean cc = aa || bb;  // aa1 또는 bb1 가 true 인지?
		// 위도맞지만 그냥 불리안에 변수  a,b 바로 넣어서하면 코드 줄일수잇음
		//&& (and)를 논리곱이라 부르고 
		//||(or)를 논리합이라 부름  
		//!느낌표는 아니다 not 과같은 표현 프로그래밍에서
	
		System.out.println(cc); 
		

	}

}
