package random;

import java.util.Random;

public class test01랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rr = new Random();
	
		//범위지정가능

		int dice = rr.nextInt(3) + 11;   //11 부터 3개
		System.out.print(dice);	
	}

}
