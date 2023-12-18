package oop.method05;

public class Toy {
		String name;
		int price;
		boolean event;
		
		
		void data(String name, int price) {
			this.name = name;
			this.price = price;
			this.event = false;
		}
		
		
		void data(String name, int price , boolean event) {
			this.name = name;
			this.price = price;
			this.event = event;
		}
			void infor() {
				System.out.println(this.name);
				System.out.println(this.price);
				System.out.println(this.event);
			}
}
