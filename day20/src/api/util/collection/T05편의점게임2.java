package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T05편의점게임2 {

	public static void main(String[] args) {

		String aa;
		List<String> game = new ArrayList<>();
		Scanner scsc = new Scanner(System.in);

		while (true) {
			System.out.println("편의점에가면(진행중,입력해라)");
			aa = scsc.next();  				//입력받은단어
			
			if (game.contains(aa)) {
				break;
			}
			System.out.println(aa + "도 있고");
			game.add(aa);
		}
		System.out.println("끝");
		System.out.println(game);
	}

}
