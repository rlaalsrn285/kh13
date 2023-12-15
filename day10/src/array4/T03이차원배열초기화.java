package array4;

public class T03이차원배열초기화 {

	public static void main(String[] args) {

		int[][] ds = new int[5][5];
		int num = 1;
		
		for(int i=0; i<ds.length; i++) {
			for(int k=0; k<ds[i].length; k++) {
				ds[i][k] = num;
				num++;
				
			}
		}
		
		
		
		//출력
		for(int i=0; i<ds.length; i++) {
			for(int k=0; k < ds[i].length; k++) {
				System.out.print(ds[i][k]);
				System.out.print("\t");
			} System.out.println();
		}
	}

}
