package oop.mo3;

public class Phone {
	
		private String name;
		private String telCom;
		private int price;
		private int contract;
		
		void setName(String name) {
			this.name = name;
		}
		void setTelCom(String telCom) {
			this.telCom = telCom;
		}
		void setPrice (int price) {
			if(price >= 0) {
			this.price = price;
			}
		}
		void setContract(int contract) {
			if(contract == 0 || contract ==12 || contract ==24) {
			this.contract = contract;
			}
		}
		
		//getter
		String getName() {
			return this.name;
		}
		String getTelcom() {
			return this.telCom;
		}
		int getPrice() {
			return this.price;
		}
		int getContract() {
			return this.contract;
		}
		//기타메소드
		void data(String name, String telCom , int price ) {
			this.setName(name);
			this.setTelCom(telCom);
			this.setPrice(price);
			this.setContract (0);
			this.data(name,telCom,price,0);
		}
		
		void data(String name, String telCom , int price , int contract) {
			this.setName(name);
			this.setTelCom(telCom);
			this.setPrice(price);
			this.setContract(contract);
		}
		
		void print() {
			System.out.println("휴대폰" + this.getName() );
			System.out.println("통신사" + this.getTelcom() );
			if(this.getContract() != 0) {
				System.out.println(this.getPrice() /this.getContract() +"만 (월)" );
			}else {System.out.println(   this.getPrice()  -((int)(this.getPrice() * (5/100f))  ) );
			}
			System.out.println();
		}
		
		
}
