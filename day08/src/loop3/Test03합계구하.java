package loop3;

import java.util.Scanner;

public class Test03합계구하 {

	public static void main(String[] args) {
		Scanner qwqw= new Scanner(System.in);
		double to = 0;
		int count = 0;
		//count 위치를 잘못햇음 0도 셀수잇게 만들엇음;
		//count를 0이후에 만들어서 0일경우 세지않게 만들것 
		//total도 카운트처럼종료후에 하게만들어야함 지금은 0이라 상관없지만 -1이나 다른수가나올경우잘못되게됌
		while(true) {
			System.out.println("입력");
			int a = qwqw.nextInt();
			
			
			if(a==0) {
				break;
				
			}count++;
			to = to + a;
		}
		System.out.println((int)to);
		double b =to/count;
		System.out.println(b);
		
		//double a = (double) int/int 해도 double이 나옴
	}

}
