package loop;

import java.util.Scanner;

public class Test03등급판 {

	public static void main(String[] args) {
		
		int A =0;
		int B =0;
		
		Scanner inin = new Scanner(System.in);
		System.out.println("수 10개입력하시오");
		for(int i=1;  i <=10; i++) {
			int num = inin.nextInt();   //스캐너 변환
			System.out.println(i+"회 입력했음");
			if(num >=85 && num<=100) {
				A++;
			}else if(num >=70 && num<85) {
				B++;
			}
		}
		System.out.println("A  "+ A +"개");
		System.out.println("B  "+ B +"개");
		
	}

}
