package array4;

public class T01이차원배열 {

	public static void main(String[] args) {

		int[][] asas = new int[][] {
			{22,56,89},
			{32,11,55}
		};
		
		for(int k=0; k<asas.length; k++) {
			for(int i=0; i <asas[0].length; i++) {
				System.out.println(asas[k][i]);
		}
		}
 	}

}
