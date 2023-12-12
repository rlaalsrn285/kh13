package loop;

public class Test04노인정정답뱃긴거 {

	public static void main(String[] args) {
		int total =  0;
		int money = 1;
		for(int day=1; day <=2; day++) {
			System.out.println(day +"일차" + money );
			total +=money;
			money *=2;
			
			
		}System.out.println (total);
			
		

	}
			//혼자풀엇을때 실패함 반드시 다시풀어볼것
}
