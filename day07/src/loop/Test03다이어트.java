package loop;

public class Test03다이어트 {

	public static void main(String[] args) {
		int t = 0;  //총
		int f =  100; //첫날갯수
		int d = 0; // 일자별
		int e =  10; //줄넘기 추가횟수
		
		for (int i=1; i <=30; i++ ) {
			d = f + (i * e) - e;    //1일차의 추가횟수10이 추가되서다시 10을뺏는데 이것보다 좋은식이 있나?
			
			System.out.println (i + "일자" + d + "개");
			
		}for (int i=1; i <=30; i++) {
			t = t + f + (e*i) - e; // 위와 같음 
		}
		System.out.println ("총" + t + "개");
	}

}
//부등호실수 1회
//답은맞으나 변수를 지금보다더 잘쓰는 방법이 있음
//다시생각해볼것 ,,, 두번째 for문 안쓰고 변수를 잘써서 더짧게 가능  다시풀어볼것
//반복변수 여러개도가능 다만권장하지는 않는방법이라함  c언어에선 좋아하는데