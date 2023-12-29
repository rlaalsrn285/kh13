package api.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T4LocalDateTime클래 {

	public static void main(String[] args) {

		LocalDateTime a =LocalDateTime.now();
		LocalDateTime b =LocalDateTime.of(2024,1,2,9,30);
		
		System.out.println(a);
		System.out.println(b);
		
		
		DateTimeFormatter fmtt =DateTimeFormatter.ofPattern("y년 M월 d일 H시m분");
		
		System.out.println(a.format(fmtt));
		System.out.println(b.format(fmtt));
		
		System.out.println(a.isBefore(b));
		
		Duration dur = Duration.between(a, b);
		
		System.out.println(dur.getSeconds());
		
		LocalDateTime finish = LocalDateTime.now();
		LocalDateTime project = finish.minusDays(3);
	}

}
