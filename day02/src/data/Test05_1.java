package data;

public class Test05_1 {

	public static void main(String[] args) {
		int sam = 1200;
		int samCount = 8; 
		
		int a =(samCount/3); // 삼각김밥공짜개수
		int b =(samCount/3); //삼각김밥 2+1 적용
		int c =(samCount%3); //2+1적용하고 나머지
		
		System.out.println(a);
		System.out.println(sam*(b+c) );

	}

}
