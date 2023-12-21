package oop.scanner;

import java.util.Scanner;

public class gamecha {

	public static void main(String[] args) {

			Scanner scsc = new Scanner(System.in);
			
			String aa =scsc.next();
			String bb =scsc.next();
				game a = new game(aa , bb );
				
				a.lvup();
				a.print();
				
				
	}

}
