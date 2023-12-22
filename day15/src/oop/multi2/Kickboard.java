package oop.multi2;

public class Kickboard implements Electronic,Transportation{

	@Override
	public void move() {
		System.out.println("전동킥보드 이동");
	}

	@Override
	public void onOff() {
		System.out.println("전동킥보드 온오프");
	}

}
