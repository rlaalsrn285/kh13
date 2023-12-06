package data2;

public class Test03급여 {

	public static void main(String[] args) {
		
		double a = 300; // 만
		double aa = a*10000; // 원
		double b = aa*0.045; // 국민연금
		double c = aa*0.0709; // 건강보험료 
		double cc = c*0.1281; // 장기요양
		double d = aa*0.009; // 고용보험료
		double e = aa-b-c-cc-d; //실수령
		//돈은 소수점아래는취급안하니 정수로 계산 
		//300만은 만,원 단위가아니라 그냥 숫자 300만 박아야함
		//돈은 소수점아래로는 계산안함
		//4.5%를 내임의로 0.045로 바꾼것 이것도 오답
		//할거엿다면 4.5 /100으로 햇어야함
		System.out.println(e);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		System.out.println(d);
		

	}

}
