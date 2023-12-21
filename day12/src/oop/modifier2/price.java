package oop.modifier2;

public class price {

	public static void main(String[] args) {

		ClassP a =new ClassP();
		ClassP b =new ClassP();
		ClassP c =new ClassP();
		
		a.data("자바마스터", 90, 1000000);
		b.data("파이썬 기초", 60, 600000);
		c.data("웹개단", 120, 1200000);
		
		
		a.print();
		b.print();
		c.print();
		
		
	}

}
