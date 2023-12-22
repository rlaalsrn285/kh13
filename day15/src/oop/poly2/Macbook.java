package oop.poly2;

public class Macbook extends Notebook{

	@Override
	public void power() {
		System.out.println("맥북 전원");
	}

	@Override
	public void video() {
		System.out.println("맥북 동영상");
	}

	@Override
	public void typing() {
		System.out.println("맥북 타이핑");
	}

}
