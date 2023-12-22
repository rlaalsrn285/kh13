package oop.multi2;

public class Train implements Transportation,Reserve{

	@Override
	public void reservation() {
		System.out.println("기차 예약");
	}

	@Override
	public void move() {
		System.out.println("기차 이동");
	}

}
