package array3;

public class 버블정렬 {

	public static void main(String[] args) {
		int[] arr = new int[] { 30, 20, 50,40,60  };
		int backup = 0;
		
		for (int k = 0; k < arr.length - 1; k++) {
			int a = arr.length;
			for (int i = 0; i < a - 1; i++) {
				System.out.println("k = " + k + " , i = " + i + " , (i+1) = " + (i+1));
				if (arr[i] > arr[i + 1]) {
					backup = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = backup;
					a--;
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
