package array4;

public class T05지그재 {

	public static void main(String[] args) {

		int[][] bing = new int[5][5];
		int num= 1;
		
		for(int k=0; k < bing.length; k++) {
			for(int i =0; i < bing[k].length; i++) {
				bing[k][i] = num;
				num++;
			}
				
		}for(int i=0; i<bing.length; i++) {
			for(int k=0; k < bing[i].length; k++) {
				System.out.print(bing[i][k]);
				System.out.print("\t");
			} System.out.println();
		}
	}

}
