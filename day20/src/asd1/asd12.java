package asd1;

import java.time.LocalDate;
import java.time.Period;

public class asd12 {

	public static void main(String[] args) {

		LocalDate aa = LocalDate.now();
		LocalDate a = LocalDate.of(2050, 12 , 25);
		LocalDate b = a.plusYears(20);
		
		Period pp = Period.between(aa, b);
		
		
		System.out.println(pp.getYears() +"년"+ pp.getMonths() +"월"+ pp.getDays() + "일");
	}

}
