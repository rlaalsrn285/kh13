package oop.method6;

public class Mall {
	
		String name;
		String cate;
		int price;
		boolean emd;
		boolean event;
		
		void infor() {
			if(emd) {
				if(event) {
					System.out.println(this.name+"새벽배송가능 2500추가" );
					System.out.println(this.price + "행사중" +"할인가" +((int) (this.price - (this.price)* (10/100d))));
				}else {System.out.println(this.name+"새벽배송가능 2500추가" );
				System.out.println(this.price);
				}
				}else {
					if(event) {
						System.out.println(this.name);
						System.out.println(this.price + "행사중" +"할인가" + ((int)(this.price - (this.price)* (10/100d))));
					}
				
			}
		}
		
		void data (String name, String cate, int price, boolean emd) {
			this.name = name;
			this.cate = cate;
			this.price = price;
			this.emd = emd;
		}
	
		void data (String name, String cate, int price, boolean emd, boolean event) {
			this.name = name;
			this.cate = cate;
			this.price = price;
			this.emd= emd;
			this.event = event;
		}

}
