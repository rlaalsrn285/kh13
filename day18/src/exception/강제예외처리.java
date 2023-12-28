package exception;

import java.util.Scanner;

public class 강제예외처리 {

	public static void main(String[] args) {
		
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("귤 개수 : ");
			int mandarin = sc.nextInt();
			System.out.print("인원 수 : ");
			int people = sc.nextInt();
			
			int dist = mandarin / people;
			int rest = mandarin % people;
			
			System.out.println("한 사람당 "+dist+"개 씩 줄 수 있습니다");
			System.out.println("다 주면 "+rest+"개 남네요");
		}
		//catch(RuntimeException e) {//Plan B
		catch(Exception e) {//Plan B
		//catch(Throwable e) {//Plan B (Error까지 처리됨)
		//catch(Object e) {//error
			System.err.println("잘못된 입력");
		}
		
	}

}
