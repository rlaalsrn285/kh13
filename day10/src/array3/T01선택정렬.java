package array3;

public class T01선택정렬 {

	public static void main(String[] args) {
				
			int[] arr = new int[] {30,20,50,10,40};
			int mini =0;
			int backup = 0;
			//최소값찾기부터 , 찾은다음 미니랑 0번이랑 바꾸기(백업필요)
			//백업에 0번 넣고 , 0번에 미니넣고 , 미니에 백업넣고
			for(int i=0; i <arr.length; i++) {
				if(arr[mini] > arr[i]) {
					mini = i;
				}
			backup = arr[i] ;
			arr[i] = arr[mini];
			arr[mini] = backup;
			
				
			}for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
			}
	}

}
