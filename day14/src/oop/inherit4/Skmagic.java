package oop.inherit4;

public class Skmagic extends Purifier{
		
			public Skmagic(String com,int price , String cate) {
				super(com , price , cate);
			}
			
			public void cold() {
				System.out.println("냉수 1잔");
			}
			
			public void hot() {
				System.out.println("온수1잔");
			}
			

}
