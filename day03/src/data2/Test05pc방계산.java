package data2;

public class Test05pc방계산 {

	public static void main(String[] args) {
		int a = 12; //이용시작 시
		int b = 20; // 이용시작 분
		int c = 15; //종료 시
		int d = 30; //종료 분
		
		int g = a*60+b ; // 시작 분환산
		int h = c*60+d; //종료 분환산
		int i = h-g; //이용시간 분환산
		int e = 1000; //1시간당 요금
		int aa = i/60*e;   //이용금액 1시간단위 계산한금액
		int bb = i%60; // 분단위 짜른거
		
		double cc = 1000*bb/60; //잉여 분 요금만든거
		
		double dd = cc + aa; //총요금
		double ee = dd/10;  //10원 삭제작업
		double ff = (int) ee*10; //최종요금
		int gg = (int)ff;
		
		System.out.println(gg);
		//이거 처음부터 요금을 1시간 1000원을 60분 1000원으로 환산해서 해볼껄 (이거틀린생각)
		//시간을 1220 , 1310처럼 표현 나누기 나머지로 시간분도 표현가능 , 난일단이렇게안햇음
		// L마냥 11d붙이면 더블로인신
		
		//(int1)aa1a + 11 이라하면 aaa1를 먼저in1t로 바꿔지는것이지
		// aaa1+11 의값이 int1가되는것이 아님
		//위에 돈저거 계산할때 나누기10 곱하기10 을  변수두개로 나눠하지말고 /10 * 10해서 코드를 짧게가능

	}

}
