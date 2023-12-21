package oop.inherit4;

public class Test01 {

	public static void main(String[] args) {

		Coway a = new Coway("코웨이" , 50 , "얼음 정수기");
		a.print();
		a.normal();
		a.cold();
		a.ice();
		System.out.println();
		Skmagic b = new Skmagic("SK매직" , 65 , "복합 정수기");
		b.print();
		b.normal();
		b.hot();
		System.out.println();
		Cuckoo c = new Cuckoo ("쿠쿠" , 45 , "온수 정수기");
		c.print();
		c.normal();
		c.cold();
		c.hot();
		System.out.println();
	}

}
