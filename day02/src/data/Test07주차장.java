package data;

public class Test07주차장 {

	public static void main(String[] args) {
		int a = 1500; // 이용요금
		int b = 17; // 이옹죵료시간에서 시
		int c = 25; // 이용종료시간에서 분
		int d = 11;//이용시작시간에서 시
		int e = 50;// 이용시작시간에서 분
		
		int f = (b*60 + c); //이용종료시간 분으로 환산
		int g = (d*60 + e); // 이용시작시간 분으로환산
		int h = (f-g); //총 이용한시간 분으로 환산
		
		int i = (h/10); //10분1500원 요금을 을 몇회 사용햇는지
		
		int j= (a*i); // 이용요금 * 요금사용횟수 
		//나머지값 5는 9분이하는 무료로 취급

		
		System.out.println(j);
	
	}

}
