package loop;

public class Test04노인 {

	public static void main(String[] args) {
		int g = 1;
		int aa; //총골드? 1(g) 2(g+g) 4(g+g) 8(g+g)
		
		for(int i=1; i <=5; i++) {
			System.out.println(i +"일차" + g );
			aa= g*2*i;
			g= g+g;
			

		}//개선된식으로하려니까 못하겟음. 다시해볼것..

	}

}
