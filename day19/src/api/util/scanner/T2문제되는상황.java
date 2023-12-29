package api.util.scanner;

import java.util.Scanner;

public class T2문제되는상황 {

	public static void main(String[] args) {

		
		Scanner qwe = new Scanner(System.in);
		
		
		System.out.println("이름");
		
		String name = qwe.nextLine();
		
		System.out.println("소개");	
		
		String intro = qwe.next();
		
		System.out.println(name + " kk " + intro);
	}

}
