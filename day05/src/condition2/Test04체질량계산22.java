package condition2;

import java.util.Scanner;

public class Test04체질량계산22 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		
		System.out.println("키입력");
		double weight = scsc.nextDouble();
		System.out.println("몸무게입력");
		double height = 	scsc.nextDouble();
		
		double bmi = height/(weight*weight);
		String aa;
		
		if (bmi >= 30) {
			aa = "중등도";
		}else if (bmi >=25 && bmi <30) {
			aa = "경도";
		}else if (bmi >=23 && bmi < 25){
			aa = "과체";
		}else if (bmi >= 18.5 && bmi < 23) {
			aa = "정상";
		}else {
			aa = "저체중";
		}
		System.out.println(aa);
	}
}
//똑같은실수 또햇네 판정을 변수로
