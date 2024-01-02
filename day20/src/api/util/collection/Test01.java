package api.util.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[]args) {
		
		
		TreeSet<String> bb =new TreeSet<>();
		
		ArrayList<String> cc = new ArrayList<>();
		
		bb.add("리자몽");
		bb.add("피카츄");
		bb.add("꼬부기");
		bb.add("뮤");
		
		cc.add("피카츄");
		cc.add("리자몽");
		cc.add("꼬부기");
		cc.add("뮤");
		System.out.println(bb);
		System.out.println(cc);
	}

}
