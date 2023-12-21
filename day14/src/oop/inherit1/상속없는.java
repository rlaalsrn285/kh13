package oop.inherit1;

public class 상속없는 {

	
		public static void main(String[] args) {
			//각각의 휴대폰을 하나씩 생성해서 사용 가능한 모든 메소드 호출
			GalF5 p1 = new GalF5();
			p1.call();
			p1.sms();
			p1.bixby();
			
			Ip15 p2 = new Ip15 ();
			p2.call();
			p2.sms();
			p2.siri();
			
		}
}
