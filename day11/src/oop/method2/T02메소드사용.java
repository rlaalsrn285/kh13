package oop.method2;

public class T02메소드사용 {

	public static void main(String[] args) {

		MedalP a = new MedalP();
		MedalP b = new MedalP();
		MedalP c = new MedalP();
		
		a.data("진종오","사격","하계",4,2,0);
		b.data("김수녕", "양궁", "하계", 4, 1, 1);
		c.data("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		a.infor();
		b.infor();
		c.infor();
	}

}
