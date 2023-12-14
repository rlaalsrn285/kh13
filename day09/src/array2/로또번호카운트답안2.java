package array2;

import java.util.Random;

public class 로또번호카운트답안2 {

	public static void main(String[] args) {
		Random r = new Random();
		int [] counts = new int[6]; //안에내용물 0인상태 6개공간
	
		
		for(int i=0; i<10; i++) {
			int number = r.nextInt(6)+1;
			
			System.out.println(number);
			counts[number-1]++;  //현재 이해불가 다시봐야함
		}
		
		for(int i=0; i<=5; i++) {
			System.out.println((i+1)+"횟수" + counts[i] );
		}
		
		
	}

}
