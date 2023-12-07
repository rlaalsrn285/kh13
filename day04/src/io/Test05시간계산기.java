package io;

import java.util.Scanner;

public class Test05시간계산기 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		//이거잘못풀엇다 시발다시해야함

		//입력
		//입실시간.퇴실시각을 4자리정수
		System.out.println("입실 시 입력");
		int a =  in.nextInt();   //입실 시 
		System.out.println("입실 분 입력");
		int b = in.nextInt(); // 입실 분
		System.out.println("퇴실 시 입력");
		int c = in.nextInt();//퇴실 시
		System.out.println("퇴실 분 입력");
		int d= in.nextInt(); //퇴실 분
	
		//계산
		int aa = (a*60) + b; //입실 총 분
		int bb= (c*60) + d; // 퇴실분
		int cc = bb-aa;
		int dd = cc/60; //이용 시간
		int ee = cc%60; //이용 분
		
		
		//출력
		System.out.println(dd + "시간");
		System.out.println(ee + "분 이용");
	}

}
