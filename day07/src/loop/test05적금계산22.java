package loop;

public class test05적금계산22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mI = 10000;	//monthly installment
		int yI; // 년 납입금
		int year = 2;
		double interest;
		double iP =3d; //이자율
		int balance =0;   //잔액
	
		
		
		for (int i = 1; i <=year; i++) {
			balance = balance + (mI*12);  
			interest = (int)balance  * (iP/100d); //이자계산
			int a = (int)interest;   //이자 금액
			
			System.out.println ("원금" + balance + "이자" + a +"잔액" +(balance + a) );
			
			//System.out.println (원금(원금+잔액) + 이자 + 잔액)
		}
		

	}

}
