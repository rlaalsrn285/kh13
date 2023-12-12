package loop;

public class Test02누적합계2 {
	public static void main(String[]args) {
		
		int en = 0;  //even number
		int mul = 0; //multiple
		for (int i=1; i <=100; i++) {
			if(i % 2 == 0) {
				en +=i;
			}
			
		}for (int i=1; i <=100; i++) {
			if(i % 7 == 0) {
				mul += i;
			}
			
		}
		System.out.println("짝수합" + en);
		  System.out.println("7의배수합" + mul);
		
	}

}
