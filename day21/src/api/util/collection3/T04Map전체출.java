package api.util.collection3;

import java.util.Map;
import java.util.Set;

public class T04Map전체출 {

	public static void main(String[] args) {
		Map<String,Integer> votes = Map.of("리자몽",2,"꼬북",5);
		
		Set<String> asd = votes.keySet();
		
		System.out.println(asd);
		
		for(String qqq : asd) {
			System.out.println(qqq);
			System.out.println(votes.get(qqq));
		}
	}

}
