package loop;

public class 삼육구 {

	public static void main(String[] args) {
		
		for(int i=1 ; i <=99 ; i++) {
			boolean a = i/10 == 3 || i %10 ==3;
			boolean b = i/10 == 6 || i %10 ==6;
			boolean c = i/10 == 9 || i %10 ==9;
			if ( a || b || c) {
				System.out.println (i);
			}
			
		}//박수횟수구분은 답보고 알앗으니 다시스스로해볼것

	}

}
