package oop.method6;

public class mallprice {

	public static void main(String[] args) {

		Mall a = new Mall();
		Mall b = new Mall();
		Mall c = new Mall();
		Mall d = new Mall();
		
		a.data("참이슬후레쉬","주류",1200,true,true);
		b.data("클라우드맥주", "주류", 3000, false, true);
		c.data("바나나킥", "과자", 1500, false, true);
		d.data("허니버터칩", "과자", 2000, true);
		
		a.infor();
		b.infor();
		c.infor();
		d.infor();
		
		
		
	}

}
