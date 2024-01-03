package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class T01map {

	public static void main(String[] args) {

			Map<String,Integer> people = new HashMap<>();
			
			people.put("둘리", 30);
			people.put("또치", 30);
			people.put("마이콜", 40);
			//people.put("둘리", 40);  덮어쓰기돼버림 둘리 밸류가 40으로 바뀜
			
			people.remove("둘리");
			
			System.out.println(people.get("마이마이콜"));
			System.out.println(people.containsValue(402));
			
			
	}

}
