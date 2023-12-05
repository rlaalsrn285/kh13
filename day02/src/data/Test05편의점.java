package data;

public class Test05편의점 {

	public static void main(String[] args) {

		int sam = 1200;
		int samCount = 7;
		
		int a =(samCount/2); // 삼각김밥공짜개수
		int b =(samCount/2); //삼각김밥 1+1 적용
		int c =(samCount%2); //1+1적용하고 나머지
		
		System.out.println(a);
		System.out.println(sam*(b+c) );
		
	}

}
