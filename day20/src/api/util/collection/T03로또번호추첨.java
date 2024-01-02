package api.util.collection;

import java.util.ArrayList;
import java.util.Random;

public class T03로또번호추첨 {
		//이것도 실패 왜인지모르겟지만 가끔에러나거나 매우느림
	public static void main(String[] args) {

		ArrayList<String> lo = new ArrayList<>();
		Random rd = new Random();
		String aa;
		
		for(int i = 0; i <6; i++) {
		aa = (String.valueOf(rd.nextInt(45)+1));
		
		while(lo.contains(aa)) {
			lo.add(String.valueOf(rd.nextInt(45)+1));
		}
		
		lo.add(aa);
		
		}
		System.out.println(lo);
		
	}

}
