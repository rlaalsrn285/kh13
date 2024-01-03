package api.util.collection2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class asd연습용 {

	public static void main(String[] args) {

		LocalDate current = LocalDate.now();
		//System.out.println(current);
		
		DateTimeFormatter fmfm =DateTimeFormatter.ofPattern("y년년 M월월 d일일 E");
		System.out.println(current.format(fmfm));
	}

}
