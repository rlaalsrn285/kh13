package io;

import java.util.Scanner;

public class 떡볶이가격 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dduk = 3000; //떡 가격
		System.out.println("떡볶이수");
		int ddukC =in.nextInt(); //떢 수
		int fried = 500; // 튀 가격
		System.out.println("튀김 수");
		int fC = in.nextInt();;  // 튀 수
		int sun = 2000; //순 가격
		System.out.println("순대 수");
		int sC = in.nextInt();//순 수
		int dis = 10; // 할인
		
		int to = ((dduk*ddukC) + (fried*fC) + (sun*sC)); //원금
		double a = to*(dis*0.01); //할인된금액
		double c = to-a;
		
		int aaa = (int)c;
		
		System.out.println(aaa);
		//이거보다 더간결하게 할수있을거같은데 잘생각이 나지않습니다
		// 할인율을 변수로사용하고싶은데 어떻게해야할지 생각이 잘안나 (dis*0.01) 부분은 인터넷 검색했습니다
	}

}
