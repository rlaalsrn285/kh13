package io;

import java.util.Scanner;

public class 시간계산기다시 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("입실시각");
		int a = in.nextInt(); //입실시각
		System.out.println("퇴실시각");
		int b = in.nextInt(); //퇴실시각
		
		
		int c = (a/100*60) + (a%100); //입실시간 분환산
		int d = (b/100*60) + (b%100); //퇴실시간 분환산
		
		
		int e = (d-c)/60; // 이용시간 시
		int f = (d-c)%60; //이용시간 분
		
		System.out.println(e);
		System.out.println(  f);
		
		
		//p1rint라인 한줄띄어서하고싶을때 p1rintln() 한번더넣거나 시작전에 역슬래시 엔터기능찾기
		

	}

}
