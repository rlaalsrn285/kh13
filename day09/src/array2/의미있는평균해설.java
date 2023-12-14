package array2;

public class 의미있는평균해설 {

	public static void main(String[] args) {

		float[] a = new float[3];
		
		a[0] = 1.1f;
		a[1] = 1.2f;
		a[2] = 7.2f;
		int  max = 0;
		int min = 0;
		for(int i=1;  i < a.length; i++) {
			if(a[max] < a[i] ) {
				max = i;  	}
		}for(int i=1; i <a.length; i++) {
			if(a[min]>a[i]){
				min = i;
		}
	}
		System.out.println(a[max]);
		System.out.println(a[min]);
}
}
