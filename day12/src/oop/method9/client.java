package oop.method9;

public class client {

	public static void main(String[] args) {

		Savings a = new Savings();
		Savings b = new Savings();
		Savings c = new Savings();
		
		a.data("유재석", 2.20, 1, 500000, 2);
		b.data("강호동", 2.50, 1, 500000, 2);
		c.data("신동엽",2.35,1.50,600000,3);
		
		a.print();
		b.print();
		c.print();
		
	}

}
