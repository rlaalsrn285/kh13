package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class T04List명령 {

	public static void main(String[] args) {

		//ArrayList<String> as = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("도롱뇽");
		list.add("도롱롱");
		list.add(1,"리자몽");
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
