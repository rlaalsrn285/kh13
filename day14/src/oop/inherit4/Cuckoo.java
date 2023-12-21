package oop.inherit4;

public class Cuckoo extends Purifier {
	
	public Cuckoo(String com,int price , String cate) {
		super(com , price , cate);
	}
	
	public void cold() {
		System.out.println("냉수 1잔");
	}
		
		public void hot() {
			System.out.println("온수1잔");
		}
}
