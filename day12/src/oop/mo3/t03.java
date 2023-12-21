package oop.mo3;

public class t03 {

	public static void main(String[] args) {

		Phone a = new Phone();
		Phone b = new Phone();
		Phone c = new Phone();
		Phone d = new Phone();
		
		a.data("폴드4", "SK", 180 );
		b.data("폴드4", "KT", 175, 24);
		c.data("아이폰15", "LG", 200, 30);
		d.data("아이폰", "SK", 199);
		
		a.print();
		b.print();
		c.print();
		d.print();
	}

}
