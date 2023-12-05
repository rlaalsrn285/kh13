package data;

public class Test06_3 {

	public static void main(String[] args) {
		//시간을 분으로 바꾸고 
		//바꾼분으로 변수 시간,변수 분으로 만들고
		//출력
		int rtyHour = 2;
		int rtyMinute = 30;
		int ttyHour = 4;
		int ttyMinute = 14;
	
		int rtyTotalM = (rtyHour*60 + rtyMinute );
		int ttyTotalM = (ttyHour*60 + ttyMinute );
		int total = rtyTotalM + ttyTotalM;
		int totalH = total/60;
		int totalM = total%60;
		System.out.println(totalH);
		System.out.println(totalM);

	}

}
