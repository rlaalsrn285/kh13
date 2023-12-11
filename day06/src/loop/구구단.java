package loop;

public class 구구단 {

	public static void main(String[] args) {
		
		int bb;
		for (int i =2 ; i <=9 ; i = i + 1 ) {
			System.out.println("");
			System.out.println(i +"단");
			
			for( int a= 1; a <= 9 ; a++) {
				bb = i*a;
				System.out.println (i + "*" + a+ " =   " + bb);
				
				
			}
			
			
		}
	}

}
