package oop.poly2;

import java.util.Scanner;

public class Test1다형성객체생성 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		
		String a = scsc.next();
		//맥북 갤북 둘중하나입력
		
		Notebook cc;
		
		switch(a) {
		case "갤북": cc = new Galbook();
			break;
		case "맥북": cc = new Macbook();
			break;
		default:
            System.out.println("잘못된 입력입니다.");
            return;
		}
		cc.power();
		cc.video();
	}

}
