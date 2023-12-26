package api.lang.object;

public class Test03 {

	public static void main(String[] args) {
			StringBuffer a = new StringBuffer();
			
			StringBuffer b = new StringBuffer("방가방가");
			
			
			
		
			System.out.println(a.toString() );
			System.out.println(b.toString() );
			System.out.println(a.length()) ;
			System.out.println(b.length()) ;
			
			a.append("개구리");
			b.append("너구리");
			
			System.out.println(a.toString());
			System.out.println(b.toString());
			System.out.println(a.length()) ;
			System.out.println(b.length()) ;
			
	}

}
