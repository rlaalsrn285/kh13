package oop.method3;

public class datalimit객체 {

	public static void main(String[] args) {

		DataLimit a = new DataLimit();
		DataLimit b = new DataLimit();
		DataLimit c = new DataLimit();
		
		a.data("Sk","5g언택",52000,200,1000,2000);
		b.data("kt","5g세이브",45000,100,900,1500);
		c.data("lg","5g시그니처",130000,500,2000,2500);
		
		a.infor();
		b.infor();
		c.infor();
		
		
		
	}

}
