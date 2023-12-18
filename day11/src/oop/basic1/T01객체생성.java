package oop.basic1;

public class T01객체생성 {

	public static void main(String[] args) {

		Message a = new Message();
		a.sender = "라이언";
		a.content = "오늘";
		a.time = "오후";
		a.people = 1;
		
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.people);
				
		Message b = new Message();
		
		b.sender = "뽀로로";
		b.content = "늦게";
		b.time = "오후12:31";
		b.people = 0;
		
		System.out.println(b.sender);
		System.out.println(b.content);
		System.out.println(b.time);
		System.out.println(b.people);
	}

}
