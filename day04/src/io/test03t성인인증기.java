package io;

import java.util.Scanner;

public class test03t성인인증기 {

	public static void main(String[] args) {
		//입력 (입력을 다만들고 마지막에 스캐너 바꿈) 그게더편하고 빠름
		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();
		
		//계산
		int age = 2023 - birth +1;
		boolean adult = age >=20;
		
		//출력
		System.out.println(age);
		System.out.println(adult);

	}

}
