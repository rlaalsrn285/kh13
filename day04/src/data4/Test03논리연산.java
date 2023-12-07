package data4;

public class Test03논리연산 {

	public static void main(String[] args) {
		//논리연산
		//19은청소년인가?
		//청소년은 14=< ? <=19? 이건 잘못된식임 (처음에 나이렇게함)
		//14<= 19 하고나서 나온값이 true 인데 19와 연산이 불가능하기에 잘못된식
		//그리고 연산자를 사용해서 && 식을 올바르게 만들어봄 
		//논리연산은 논리끼리 사용함 
		//논리연산의종류 &&는 and , ||이 or임11
		int a = 19;
		boolean b = 14<= a && a<=19;
		
		System.out.println(b);
		
		boolean c = a >= 65 || a <9;
		System.out.println(c);
		// || 연산 (and)
		
		

	}

}
