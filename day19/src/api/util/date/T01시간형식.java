package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T01시간형식 {

	public static void main(String[] args) {
		Date a = new Date();
		Date b =  new Date();
		
		SimpleDateFormat aa = new SimpleDateFormat ("yyyy년MM월dd일"); //한개씩써야한다함 완전이해는아직못함
		System.out.println(aa.format(a));
		
		SimpleDateFormat bb = new SimpleDateFormat("aH시m분"); //각국가컴퓨터에 맞게 나옴 언어는
		System.out.println(bb.format(b));
		
		
		

	}

}
