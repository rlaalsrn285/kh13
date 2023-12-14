package array2;

public class 로또번호카운트 {

	public static void main(String[] args) {
		int count = 0;
		int a;
		int [] cc = new int[] {1,2,3,3};
		
		for (int i = 0; i < cc.length; i++) {
			a= cc[i]; 
			for (int ii = 0; i < cc.length; i++) {
				if (a==cc[ii]) {
					count++;
				}System.out.println(a +" " + count);
		}
		}
	}

}
