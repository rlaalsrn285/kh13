package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class T05집합연산 {

	public static void main(String[] args) {

		Set<Integer> aa = Set.of(10,20,30,60);
		Set<Integer> bb = Set.of(30,40,50,60);
		
		Set<Integer> union = new TreeSet<>();
		
		union.addAll(aa);
		union.addAll(bb);
		
		//System.out.println(union);
		
		Set<Integer> intersect = new TreeSet<>();
		
		intersect.addAll(aa);  //aa전부추가
		intersect.retainAll(bb); 		// b와 겹치는부분만 추가
		
		//System.out.println(intersect);
		
		Set<Integer> minuss = new TreeSet<>();
		minuss.addAll(aa); // aa전부추가
		minuss.removeAll(bb); 		//bb에 포함된 내용제거
		System.out.println(minuss);
		
		
		
	}

}
