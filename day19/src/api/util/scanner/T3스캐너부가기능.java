package api.util.scanner;

import java.util.Scanner;

public class T3스캐너부가기능 {

	public static void main(String[] args) {
		
		String colors = "빨강+검정*노랑";
		
		Scanner rere = new Scanner(colors);
		rere.useDelimiter("\\+");
		while(rere.hasNext()) {
			System.out.println(rere.next());
		}
		
	}

}
