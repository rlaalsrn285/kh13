package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class T02로그인프로그 {

	public static void main(String[] args) {

		Map<String, String> idpa = new HashMap<>();
		idpa.put("kh12", "asas1212");
		idpa.put("피카츄", "라이츄");

		String a = "피카";
		String b = "라이";

		if (idpa.containsKey(a)) { //이거한줄만에도 가능
			if (idpa.get(a).equals(b)) { 						// a의 비번이 b와 같은지
				System.out.println("로그인성공");
			} else {
				System.out.println("비번틀");
			}
		
		
		} else {
			System.out.println("아디틀");
		}

	}

}
