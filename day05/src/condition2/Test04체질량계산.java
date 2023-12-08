package condition2;

import java.util.Scanner;

public class Test04체질량계산 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		
		System.out.println("키입력");
		double weight = scsc.nextDouble();
		System.out.println("몸무게입력");
		double height = 	scsc.nextDouble();
		double bmi = height/(weight*weight);
		
		if (bmi >= 30) {
			System.out.println(bmi+"중등도비");
		}else if (bmi >=25 && bmi <30) {
			System.out.println(bmi+"경도비");
		}else if (bmi >=23 && bmi < 25){
			System.out.println(bmi+"과체");
		}else if (bmi >= 18.5 && bmi < 23) {
			System.out.println(bmi+"정상");
		}else {
			System.out.println(bmi+"저체");
		}
	}
}
//똑같은실수 또햇네 판정을 변수로
