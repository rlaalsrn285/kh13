package api.util.collection2;

import java.util.Iterator;
import java.util.Set;

public class T04Set출력 {

	public static void main(String[] args) {
		
		Set<String> ddd = Set.of("뮤","리자몽","기라티나");
		
		for(String sss : ddd) {
			System.out.println(sss);
		}
		
		Iterator<String> iter = ddd.iterator(); 
		while(iter.hasNext()) {
			String qqq = iter.next();
			System.out.println(qqq);
		}
		
	}

}
