package oop.multi2;

public class Drone implements Electronic,Transportation,Flyable{

	@Override
	public void fly() {
		System.out.println("드론 비행");
	}

	@Override
	public void move() {
		System.out.println("드론 이동");
	}

	@Override
	public void onOff() {
		System.out.println("드론 온오프");
	}

}
