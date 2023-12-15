package array4;

public class T05지그재2 {

	public static void main(String[] args) {

		int[][] bing = new int[5][5];
		int num= 1;
		
		for(int k=0; k < 5; k++) {
			for(int i=0; i <5; i++) {
				bing[1][4] = num;
				num++;				}
			}
		
		bing[0][0] = num;
		num++;
		bing[0][1] = num;
		num++;
		bing[0][2] = num;
		num++;
		bing[0][3] = num;
		num++;
		bing[0][4] = num;
		num++;
		
		bing[1][4] = num;
		num++;
		bing[1][3] = num;
		num++;
		bing[1][2] = num;
		num++;
		bing[1][1] = num;
		num++;
		bing[1][0] = num;
		num++;
		
		bing[2][0] = num;
		num++;
		bing[2][1] = num;
		num++;
		bing[2][2] = num;
		num++;
		bing[2][3] = num;
		num++;
		bing[2][4] = num;
		num++;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0; i<bing.length; i++) {
			for(int k=0; k < bing[i].length; k++) {
				System.out.print(bing[i][k]);
				System.out.print("\t");
			} System.out.println();
		}
	}

}
