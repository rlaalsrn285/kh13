package loop;

public class Test05필터링 {

	public static void main(String[] args) {
		//이거 홀순데내가 소수로 착각함 홀수여도 어차피 풀수잇음
		//자꾸 문제를 잘못이해함 주의할것
		//홀수 if  a% =1 로 할것
		//반복문안에 반복변수가 끝나기때문에 같은 변수명을 사용할수있음 
		//고로 그냥 반복문변수를 죄다 i 처박아도 무방
		for (int a = 1 ; a <20 ; a++) {
			switch( a ) {
			case 1: case 3: case 5: case 7: case 11: case 17: case 19 :
			System.out.println (a);
			}
		}
		for (int b=1 ; b<50 ; b++) {
			if (b%3 == 0) {
				System.out.println (b);
			}
			
		}

	}
	

}
