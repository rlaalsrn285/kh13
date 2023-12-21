package oop.inherit4;

public class Coway extends Purifier {
		
	
		public Coway(String com,int price , String cate) {
			super(com , price , cate);
	}
		
		
		public void cold() {
			System.out.println("냉수 1잔");
		}
	
		public void ice() {
			System.out.println("얼음");
		}

}
