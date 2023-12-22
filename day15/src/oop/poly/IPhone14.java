package oop.poly;

public class IPhone14  extends IPhone{

	@Override
	public void call() {
			System.out.println("아이폰14 통화");
	}

	@Override
	public void sms() {
		System.out.println("아이폰14 문자");
	}

}
