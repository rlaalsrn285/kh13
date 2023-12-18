package oop.method4;

public class Menu메소드 {

	public static void main(String[] args) {

		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		a.data("아메리카노","음료",2500,20);
		b.data("모카라떼", "음료", 3500,0);
		c.data("치즈케이크","디저트", 5000, 20);
		d.data("마카롱", "디저트", 3000, 0);
		
		a.infor();
		b.infor();
		c.infor();
		d.infor();
	}

}
