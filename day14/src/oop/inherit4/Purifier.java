package oop.inherit4;

public class Purifier {
		
		private String com;
		private int price;
		private String cate;
		
		public Purifier(String com,int price , String cate) {
			this.setCom(com);
			this.setPrice(price);
			this.setCate(cate);
		}

		public String getCom() {
			return com;
		}

		private void setCom(String com) {
			this.com = com;
		}

		public int getPrice() {
			return price;
		}

		private void setPrice(int price) {
			if(price < 0) return;
			this.price = price;
		}

		public String getCate() {
			return cate;
		}

		private void setCate(String cate) {
			switch(cate) {
				case "얼음 정수기":
				case "복합 정수기":
				case "온수 정수기":
					this.cate = cate;
			}
		}
		
		public void normal() {
			System.out.println("정수1잔");
		}
		
		public void print() {
			System.out.println(getCom() + "사" + getPrice() + "만원" + "종류" +getCate() );
		}
		

}
