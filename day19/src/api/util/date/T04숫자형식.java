package api.util.date;

import java.text.DecimalFormat;

public class T04숫자형식 {

	public static void main(String[] args) {

			int a = 1234567890;
			double b = 1234.579890;
			
			DecimalFormat qqq = new DecimalFormat("#,##0.00");
			
			
			System.out.println(qqq.format(a));
			System.out.println(qqq.format(b));
	}

}
