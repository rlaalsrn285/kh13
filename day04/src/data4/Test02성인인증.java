package data4;

import java.time.LocalDate;

public class Test02성인인증 {

	public static void main(String[] args) {
		int a =20020507;   //생년
		int b = 20231207; // 오늘날짜
		LocalDate current = LocalDate.now();
		int year = current.getYear(); //현재이해는안되지만 구글링으로 실시간연도자동갱신기능추가함
		
		
		int c = b - a; //생존일수
		
		int d = c/10000; //한국나이니까 년도만취급
		int e = d+1; //한국나이
		
		boolean aa = e>=20;  //이상인데 내가 걍위로해버렷음 이부분틀림
		
		System.out.println(aa);
		System.out.println(e);
		System.out.println(year);
		
		
	
		

	}

}
