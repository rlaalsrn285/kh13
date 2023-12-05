package data;

public class Test02_죠스떡볶이 {

	public static void main(String[] args) {
		
		int dduk = 3500;
		int fried = 2000;
		int ddukCount = 4;
		int firedCount = 2;
		int ddukTotal =dduk*ddukCount; 
		int friedTotal = fried * firedCount;
		
		
		System.out.println("떡볶이는" + ddukTotal +"원 입니다");
		System.out.println("튀김은" + friedTotal +"원 입니다");
		System.out.println("합계" +(dduk*firedCount + fried*firedCount) + "입니다");

	}

}
