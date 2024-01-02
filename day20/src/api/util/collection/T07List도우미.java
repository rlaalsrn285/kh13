package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T07List도우미 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i <= 10; i++) {
			list.add(i);
		}
		
		
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
