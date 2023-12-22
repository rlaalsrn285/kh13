package oop.poly;

public class IPhone15  extends IPhone{

	@Override
	public void call() {
			System.out.println("아이폰15 통화");
	}

	@Override
	public void sms() {
		System.out.println("아이폰15 문자");
	}

}
