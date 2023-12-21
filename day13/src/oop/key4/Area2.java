package oop.key4;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		System.out.println("생년4자리");
		int a= scsc.nextInt();
		System.out.println("윤년구분 4자리");
		int b=scsc.nextInt();
		
		System.out.println("키cm 몸무게 kg입력");
		double c = scsc.nextDouble();
		double d = scsc.nextDouble();
		
		System.out.println("11의제곱" +Area.square(11) );
		System.out.println("삼각형밑변5 높이7의넓" + Area.tri(5, 7) );
		System.out.println("반지름5 원넓" + Area.circle(5));
		System.out.println("지하철가격표" + Area.subway(a) );
		System.out.println("윤년구분" + Area.leap(b));
		System.out.println("bmi수치" + Area.bmi(c, d));
		
	}

}
