package oop.method3;

public class DataLimit {

		String telCom;
		String product;
		int monthlyFee;
		int datagiga;
		int call;
		int next;
		
		
		void infor() {
			System.out.println("통신사"+this.telCom + "상품명" + this.product + "월요금" + this.monthlyFee);
			System.out.println("데이터(기가)"+this.datagiga + "전화" + this.call + "문자"+this.next);
			System.out.println();
		}
		
		void data(String telCom,String product, int monthlyFee, int datagiga, int call,int next) {
			this.telCom = telCom;
			this.product = product;
			this.monthlyFee = monthlyFee;
			this.datagiga = datagiga;
			this.call = call;
			this.next = next;
		}
}
