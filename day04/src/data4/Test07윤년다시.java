package data4;

public class Test07윤년다시 {

	public static void main(String[] args) {
		
		int num = 2016;
		
		boolean a = num % 4 ==0; //4의배수인가 
		boolean b= num % 100 != 0; // 100의배수가 아닌가
		boolean c = num % 400 ==0; //400의 배수인가
		
		boolean aa = c || (a&&b);

		System.out.println(aa);
	}

}
