package oop.multi2;

public class 객체구현 {

	public static void main(String[] args) {
		Drone a = new Drone();
		
		a.fly();
		a.move();
		a.onOff();
		System.out.println();
		
		Airplane b = new Airplane();
		b.fly();
		b.move();
		b.reservation();
		System.out.println();
		
		Train c = new Train();
		c.move();
		c.reservation();
		System.out.println();
		
		Bus d =  new Bus();
		d.move();
		System.out.println();
		
		Kickboard e = new Kickboard();
		e.move();
		e.onOff();
		System.out.println();
		
	}

}
