package array;

import java.util.Random;
import java.util.Scanner;

public class Test06점심메뉴추천기 {

	public static void main(String[] args) {

		Random rnrn = new Random();
		Scanner scsc =  new Scanner(System.in);
		String [] lM = new String[5];
		int a = rnrn.nextInt(5)+1; //이거 1부터가 아니라 배열은0부터라 그냥 +0  즉 아므것도 쓰지말앗어야함
		
		for(int i=0; i <lM.length; i++) {
			lM[i] = scsc.next();
		}System.out.println(lM[a]);
	}//배열 크기도 변수로 지정가능 int [] aaa = new int [asas];
	// 변수 asas = 스캐너 이런식으로

}
