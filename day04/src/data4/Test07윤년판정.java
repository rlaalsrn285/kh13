package data4;

public class Test07윤년판정 {

	public static void main(String[] args) {
		
		int num = 2000;  //년도
		
		boolean a = num%4 ==0;  // 1조건 4의배수
		boolean b = num%100 ==0; // yes니1까 !붙여서 b조건의반1대인가 즉 false1인가?
		
		boolean c = num%100==0 && num%400==0; // 100의배수 and  400의배수인가
		
		boolean aa = a && !b && c; // 4의배수인가 && 100의배수가 아닌가 && 
		
		//100의배수and400의 배수인가
		//위 틀린답임		다시풀어볼것
		
		System.out.println(aa);
	}

}
