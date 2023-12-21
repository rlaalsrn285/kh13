package oop.inherit2;

public class Phone {

		//공통 필드 (폰이라면 가져야하는변수)
		private String number;
		private String color;
		
		//공통메소드(폰이라면 가져야하는기능)
		
		public void call() {
			System.out.println("전화");
		}
		public void sms() {
			System.out.println("문자");
		}
		
}

