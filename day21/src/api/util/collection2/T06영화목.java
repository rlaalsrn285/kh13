package api.util.collection2;

import java.util.HashSet;
import java.util.Set;

public class T06영화목 {

	public static void main(String[] args) {

		Set<String> ma = Set.of("서울의 봄","그 어 살","3일의 휴","괴물");
		Set<String> lui =Set.of("나플레옹","사 낙 타","서울의 봄","괴물","쏘우 X");
		
		Set<String> union = new HashSet<>();
		union.addAll(ma);
		union.addAll(lui);  // 유니온에 합치고
		
		Set<String> intersect = new HashSet<>();
		intersect.addAll(ma);
		intersect.retainAll(lui); 	 // ma를 전부추가하고 ma와 lui와 겹치는거 빼고 제거 즉 ma , lui의 교집

		Set<String> difference = new HashSet<>();
		difference.addAll(union);
		difference.removeAll(intersect);
		
		System.out.println(difference);
		//Set 출력에대해 사용해보고 연습할것 for 써서
	}

}
