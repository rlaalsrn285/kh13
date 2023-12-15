package array3;

public class T01선택정렬4 {

	public static void main(String[] args) {
				
			int[] arr = new int[] {30,20,50,10,40};
			int mini0 =0;
			int mini1 =1;
			int backup = 0;
			
			for(int i=1; i <arr.length; i++) {
				if(arr[mini0] > arr[i]) {
					mini0 = i;
					backup = arr[0] ;
					arr[0] = arr[mini0];
					arr[mini0] = backup;
				
				}for(int ii=2; i <arr.length; i++) {
					if(arr[mini1] > arr[ii]) {
						mini1 = ii;
						backup = arr[1] ;
						arr[1] = arr[mini0];
						arr[mini0] = backup;
						
					}
				}
			}
			//현재까지 최소값을찾은후 앞자리로바꿈  이다음은 1번을 최소로지정하고 나머지값들과비교후 다시자리교환
			//해야함
			System.out.println(arr[mini0]+"미니");
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			//현재까지 최소값을 찾고 0번위치에 최소값을 넣음 
	}

}
