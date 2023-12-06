package data;

public class Test09만나이 {

	public static void main(String[] args) {
		//오늘날자 2023년 12월 6일
		//2000년 1월 1일생의 만나이
		
		int today =20231206;   //오늘날짜
		int birthDate =20000101;   //출생년일
		int daysAlive =today-birthDate;  //몇일살앗나
		
		int e=daysAlive/10000;  //년
		int f=daysAlive%10000/100;  //개월
		int g =daysAlive%100;  // 일
		
		System.out.println(e + "년" +f +"개월" + g +"일" + "살았으며");
		System.out.println("만나이는" +e +"입니다");

	}

}
