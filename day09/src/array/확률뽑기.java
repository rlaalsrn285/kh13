package array;

import java.util.Random;

public class 확률뽑기 {

	public static void main(String[] args) {
			
		String[] box = new String[] {"금상자","은상자","동상자"};
		Random rara = new Random();
		int num = rara.nextInt(100)+1;
		System.out.println(num); //테스트용
		
		if(num>=1 && num <=10) {
			System.out.println(box[0]);
		}else if(num>=11 && num <=30){
			System.out.println(box[1]);
		}else {
			System.out.println(box[2]);
		}//확률을 변수처리해서도할수잇음 
		//보통을 확률도 배열로 처리한다함 이렇게하면 소수점까지구현가능 
		
		
		
	}

}
