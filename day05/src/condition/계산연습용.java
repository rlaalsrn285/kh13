package condition;

public class 계산연습용 {

	public static void main(String[] args) {
		int a = 70;
		int b = 50;  						// 과속기준
		int c = 30000; 				//벌금 시작금액
		int d = 10000; 				//초과벌금단위
		int e = 10 ;   						//초과속도 단위
		
		int f 	= 	a - b; 						//과속한속도
		int g 	= f / e; 						// 추가과속 10이 몇개인가?
		int z 	= d*g;							//추가과속 10 횟수 * 추가벌금  = 총 추가벌금
		int h 	= c + z; 						// 벌금시작금액 + 추가벌금   = 총벌금

		
		System.out.println(h);
	}

}
