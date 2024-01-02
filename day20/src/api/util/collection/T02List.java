package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class T02List {

	public static void main(String[] args) {

		ArrayList<String> aaa = new ArrayList<>();
		//LinkedList<String> bbb =  new LinkedList<>();
		//CopyOnWriteArrayList<String> ccc =new CopyOnWriteArrayList<>();
		
		aaa.add("자바");
		aaa.add("파이");
		aaa.add("안드");
		
		aaa.remove("안드");
		
		System.out.println(aaa);
	}

}
