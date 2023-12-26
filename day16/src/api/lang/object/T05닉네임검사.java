package api.lang.object;

public class T05닉네임검사 {

	public static void main(String[] args) {
			
		String a = "운영자";
		String b = "12345678901";
		
		boolean isAllowed = b.matches("[가-힣0-9]+");
		
		boolean cc =(a.equals(b));
		boolean dd=(b.length() < 2 || b.length() > 10);
		
		
				if( cc || dd) {
					System.out.println("잘못된닉");
				}else {
					System.out.println("올바른닉");
				}
				
				System.out.println(isAllowed);
	}
}
