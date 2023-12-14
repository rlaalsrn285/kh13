package array2;

public class T01최대값찾 {

	public static void main(String[] args) {

		int[] numbers =  new int[] {30,50,20,10,40};
		int rank = 0;
		
		for(int i=1; i <numbers.length; i++ ) { //1 2 3 4(여기가n[4]지점  n[5]
																			//n5 지점은 없음 배열은 0부터 시작하기에 length -1지점이 끝임
			
			if(numbers[rank] <numbers[i]) {
				rank=i; //+1로 하면 만약에 4번위치에서 숫자가넘어갓으면 4번으로 갱신되야하는데
				 					//+1되버리면 랭크 다음칸에 잇는놈이 되기때문에 i위치로 갱신해라 가 맞음
				
			}
		}System.out.println(numbers[rank]);
			
	}

}
