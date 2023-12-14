package array2;

public class T05배열뒤집 {

	public static void main(String[] args) {

		int [] arr = new int[] {30,50,20,10,40};
		int tmp1 = 0;
		//이밑에 작업을 코드화 할수잇나? 반복문으로 할수잇다는데 
		//arr[0]은 arr[i]로 표현가능하고  ,, arr[4]는 arr[arr.length]로 표현가능하고
		//
	
		tmp1 = arr[0];  //여기를 반복문시작 지점
		arr[0] = arr[4]; //arr  i = arr length
		arr[4] = tmp1;  // arr length = tmp1                            0번 4번위치 변경 
		//위에서 백업변수 쓰고 또 밑에서 이어서써도되는데 어케하나?
		tmp1 = arr[1];   // i+1이니까 앞에거 가능이고 변수도 그냥이어서쓰면되고
		arr[1] = arr[3];  // length -1 이고
		arr[3]= tmp1;    // length-1   / tmp1 그냥갖다쓰고 
									//그럼 규칙은 반복문이 끝나는지점에 length -1을 
		//변수하나더추가하고 끝지점용 하나추가
		
 		
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
