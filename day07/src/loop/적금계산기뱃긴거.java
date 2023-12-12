package loop;

public class 적금계산기뱃긴거 {

	public static void main(String[] args) {

		int year =3;
		int money = 10000;
		int ori = money*12;
		
		for (int i=1; i <=year; i++) {
			//필요한계산
			int interest = ori* 3/100;
			int balance = ori + interest;
			
			System.out.println(i + "년차");
			System.out.println("원금" + ori +"이자" + interest +"잔액" + balance);
			//데이터 변화
			//다음회차 원금(현잔고 + 월부*12)
			ori = balance + money*12;
		}
	}

}
