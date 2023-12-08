package condition;

import java.util.Scanner;

public class Test3국밥 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = 7000; // 국밥가격
		int b = 30; // 할인율

		System.out.println("나이입력하라8자리로");
		int c = in.nextInt();        // 나이 (스캐너대상)

		System.out.println("국바수량입력하라");
		int d = in.nextInt();          // 국밥수량 (스캐너대상)
		int e = 2023;               // 현재년도 이거는 실시간년도 자바기능 찾아야함 현재불가능여유되면 찾을것
		int f = e - (c / 10000) + 1;            // 한국나이계산
		double g = (double) a - (a * (b / 100d));         // 할인된국밥가격 ,, (a*(b/100d))구간에서 형변환 double 주의할것

		int aa = (int) g * d;               // 할인된국밥 *수량
		int bb = a * d;           // 할인되지 않은 국밥가격

		boolean h = f >= 65; // 나이 판단

		if (h) {
			System.out.println("할인대상이다" + aa + "원");
		} else {
			System.out.println("할인대상아님" + bb + "원");
		}

	}

}
