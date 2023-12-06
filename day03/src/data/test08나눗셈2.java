package data;

public class test08나눗셈2 {

	public static void main(String[] args) {
		
		int num = 3751;
		
		int a = num/1000; //1000의자리
		int b = num%1000/100; //100의자리
		int c = num%100/10; //10의자리 
		int e =num%10; // 1의자리
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		

	}

}
