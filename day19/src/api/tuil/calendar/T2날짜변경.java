package api.tuil.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class T2날짜변경 {

	public static void main(String[] args) {

				
				Calendar c = Calendar.getInstance();
		 		System.out.println("c = " + c);
		 		
		 		c.set(Calendar.DAY_OF_MONTH,1);
				
				Date d = c.getTime();
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println(fmt.format(d));
	}

}
