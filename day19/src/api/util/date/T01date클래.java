package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T01date클래 {

	public static void main(String[] args) {
		
		Date a =  new Date();
		
		Date b = new Date(2023,22,33);
		
		System.out.println(a);
		System.out.println(b);
		
		Date c = new Date();
		SimpleDateFormat aa = new SimpleDateFormat("yyyy년MM월dd일");
		
		System.out.println(aa.format(c));
	}

}
