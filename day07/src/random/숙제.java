package random;

public class 숙제 {

	public static void main(String[] args) {
		
		int a = 2;   			//구구단 앞자리 랜덤입력
		int b = 3;			//구구단 뒷자리 랜덤임력
		int qq = 0;        		//10점짜리 정답수
		int ww = 0;			//15점짜리 정답수
		for(int i=1; i <=10; i++) {
			int c = 11;			//정답입력 스캐너
			
			if (a*b == c) {
				System.out.println("정답");
				qq++;
			}else {
				System.out.println("오답");
			}
		}
	}

}
