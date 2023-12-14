package array2;

import java.util.Scanner;

public class T02의미있평균 {

	public static void main(String[] args) {
		Scanner sscc = new Scanner(System.in);
		double[] score = new double[5];
		int min = 0;
		int max = 0;
		double to = 0; // 점수합
		System.out.println("실수5개 입력");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sscc.nextDouble();
		}
		
		for (int i = 1; i < score.length; i++) {
			if (score[min] > score[i]) {
				min = i; // 최소값 구하  ,,,조건 <에서 
			}
		}
		
		for (int i = 1; i < score.length; i++) {
			if (score[max] < score[i]) {
				max = i; // 최대값 구하 ,,,조건 <에서
			}
		}
		
		for (int i = 0; i < score.length; i++) {
			to += score[i]; 			//총점구하기는 문제없음.
		}
		System.out.println(score[max]+"최대값");
		System.out.println(score[min]+"최소값");
		System.out.println("총점" + to);
		System.out.println((to - (score[min] + score[max])) / (score.length - 2));

	}

}
