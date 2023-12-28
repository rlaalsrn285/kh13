package exception;

import java.util.Scanner;

public class T04생년월일 {

	public static void main(String[] args) {
		
		Scanner qwqw = new Scanner(System.in);
		
		try {
		System.out.println("력");
		String birth = qwqw.next();
		
		String a = birth.substring(0,4);
		int aa = Integer.parseInt(a);
		
		String b = birth.substring(5,7);
		int bb = Integer.parseInt(b);
		
		String c = birth.substring(8,10);
		int cc = Integer.parseInt(c);
		
		System.out.println(aa+"년");
		System.out.println(bb+"월");
		System.out.println(cc+"일");
		}
		catch(Exception e) {
			System.err.println("예외");
		}
	}
}
