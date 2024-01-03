package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class T01Set2 {

	public static void main(String[] args) {

		Set<String> ts = new TreeSet<>();
		
		ts.add("바보");
		ts.add("라이츄");
		ts.add("지렁이");
		ts.remove("지렁이");
		System.out.println(ts.contains("바보"));
		System.out.println(ts);
		System.out.println(ts.size());
	}

}
