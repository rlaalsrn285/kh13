package api.util.collection;

import java.util.ArrayList;
import java.util.Random;

public class T03로또번호추첨2 {

	public static void main(String[] args) {
		//이건 아직도 들어갈수잇음 1회만 확인하기때문에
		//String이 아니라 integer 임 
		ArrayList<String> lo = new ArrayList<>();
		Random rd = new Random();
		String aa;
		
		for(int i = 0; i <6; i++) {
		aa = (String.valueOf(rd.nextInt(45)+1));
		if (lo.contains(aa)) {
			aa = (String.valueOf(rd.nextInt(45)+1));
		}
		
		
		lo.add(aa);
		
		}
		System.out.println(lo);
		
	}

}
