package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T01예외처리2통합처리 {

	public static void main(String[] args) {

		
			try {
				Scanner ssc = new Scanner(System.in);
				
				int a = ssc.nextInt();
				int b = ssc.nextInt();
				
				System.out.println(a/b);
				System.out.println(a%b);
			}
			catch(RuntimeException c){
				System.err.println("asdf");
			}
			
		
	}

}
