package oop.multi2;

public class Airplane implements Transportation,Flyable,Reserve{

	@Override
	public void reservation() {
		System.out.println("비행기 예약");
	}

	@Override
	public void fly() {
		System.out.println("비행기 비행");
	}

	@Override
	public void move() {
		System.out.println("비행기 이동");
	}

}
