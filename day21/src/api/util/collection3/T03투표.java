package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T03투표 {

	public static void main(String[] args) {

		Scanner scsc = new Scanner(System.in);
		Map<String,Integer>  vote = new HashMap<>();
		
		String a;
		while(true) {
			System.out.println("이름입력");
		a = scsc.next();
		boolean z = vote.containsKey(a);
		
		if(a.equals("종료")) {
			System.out.println("종료");
			break;
		}
		else if(!z) { //vote 에 a가 없다면
			vote.put(a, 1);			//vote 에 a추가하고 밸류값에 1을 대입
			System.out.println(a + "현재" + vote.get(a) + "획득"); 
		}
		else if (z) { //vote a가 있다면
			vote.put(a, vote.get(a) +1); 		// a의밸류값에 +1해서 덮어씌움
			System.out.println(a + "현재" + vote.get(a) + "획득"); 
		}
		}
		for(String Key : vote.keySet()) {
			Integer value = vote.get(Key);
			System.out.println(Key + "는" + value + "표");
		}
		
	}

}
