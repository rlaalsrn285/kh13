package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04업다운겜 {
//랜덤수 위치를 안에쳐박아서 틀릴뻔 실수 1회
	public static void main(String[] args) {
		Random rr = new Random();
		Scanner scsc = new Scanner(System.in);
		
		int num = rr.nextInt(1000)+1 ;
		int count= 0;
		
		while(true) {
			System.out.println("정답입력");
			System.out.println(num);  //테스트용
			int co = scsc.nextInt();
			count++;
			if( num == co) {
				break;
			}else if (co > num) {
				System.out.println ("다운");
			}else  if (co < num) {
				System.out.println("업");
			}
				
			
		}System.out.println(count + "회 후 정답");
		

	}

}
