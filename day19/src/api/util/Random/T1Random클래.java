package api.util.Random;

import java.util.Random;

public class T1Random클래 {

	public static void main(String[] args) {

		Random r1 = new Random();
		Random r2 = new Random(2L);
		
		System.out.println(r1.nextBoolean());
		System.out.println(r2.nextBoolean());
		
		
		
	}

}
