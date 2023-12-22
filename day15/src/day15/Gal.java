package day15;

public class Gal extends Phone{

	public Gal(String number, String color) {
		super(number, color);
	}
	
	public void call() {
		System.out.println("삼성 전화기능");
	}
	public void sms() {
		System.out.println("삼성문자기능");
	}
		}


