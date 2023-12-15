package array3;

public class T01선택정렬3 {

	public static void main(String[] args) {
				
			int[] arr = new int[] {30,20,50,10,40};
			int mini =0;
			int backup = 0;
			//최소값찾기부터 , 찾은다음 미니랑 0번이랑 바꾸기(백업필요)
			//백업에 0번 넣고 , 0번에 미니넣고 , 미니에 백업넣고
			//지금 최소값을찾고 0번자리에 넣고 미니자리에 원래0번(백업)을 넣음
			for(int i=1; i <arr.length; i++) {
				
				if(arr[mini] > arr[i]) {
					mini = i;
					
					backup = arr[0] ;
					arr[0] = arr[mini];
					arr[mini] = backup;
					//미니값이 i값보다 크면 미니를 i로 바꾸고
					//백업에 0번자리넣고  , 0번에 미니자리 넣고 , 미니자리에 백업을넣어라 그리고 나감
				} //현재 이프문이 끝난후 다음번도옮겨야함 근데 기존미니가아닌 미니 뒷자리에잇는놈을
				//이밑에 i는 2부터 렝스까지
				//if(arr[1] > arr[2~5]) {
				//		backup = arr[1] ;
				//arr[1] = arr[2~5];
				//arr[2~5] = backup;
				//}
				
				
			}System.out.println(arr[0]);
			//현재까지 최소값을 찾고 0번위치에 최소값을 넣음 
	}

}
