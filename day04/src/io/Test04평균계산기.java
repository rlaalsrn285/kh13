package io;

import java.util.Scanner;

public class Test04평균계산기 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); //입력도구생성 import 해야함
		int ko = in.nextInt();
		int en = in.nextInt();
		int ma = in.nextInt();
		
		
		//계산
		int a = ko + en + ma;  //총점
		
		double b = (ko + en + ma) /3.0;   //평균  정수/실수 =해야 실수나옴 123d라고해도 1double로 인정
		
		
		//출력
		System.out.println("평균"+b);
		System.out.println("총점"+a);

	}

}
