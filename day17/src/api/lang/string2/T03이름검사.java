package api.lang.string2;

public class T03이름검사 {

	public static void main(String[] args) {
		String n = "1asd-A";
		String a = "^[a-z0-9][a-z0-9-_]{4,19}$";
		
		if(n.matches(a)) {
			System.out.println("가능");
		}else {
			System.out.println("불가능");
		}
	}

}
