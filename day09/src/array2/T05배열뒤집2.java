package array2;

public class T05배열뒤집2 {

	public static void main(String[] args) {

		int [] arr = new int[] {30,50,20,10,40};
		int tmp1;
		int last = arr.length-1;
		
		for(int i=0; i <arr.length/2; i++) {
			
			tmp1=arr[i];
			arr[i] = arr[last];
			arr[last] = tmp1;
			last--;
		}
		
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
