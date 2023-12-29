package api.tuil.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class T03주말추첨 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, 2024);
		c.set(Calendar.MONTH, 0 );
		c.set(Calendar.DAY_OF_WEEK, 1);
		
		//시간 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd, E");
		System.out.println(fmt.format(d));
		
	}

}
