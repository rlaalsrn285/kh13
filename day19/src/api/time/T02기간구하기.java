package api.time;

import java.util.Calendar;
import java.util.Date;

public class T02기간구하기 {

	public static void main(String[] args) {

		String a = "2000-11-22";
		int aY = Integer.parseInt(a.substring(0,4));
		int aM = Integer.parseInt(a.substring(5,7));
		int aD = Integer.parseInt(a.substring(8,10));
		
		String b = "2002-05-11";
		
		System.out.println(a);
	}

}
