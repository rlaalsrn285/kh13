package test;

public class 숙제 {

	public static void main(String[] args) {

				String cW = "바나나";  
				
				while(true) {
					String aa ="나나나";
					int kC =0;
					
				boolean a = aa.length() !=3 ;  //제시어가 3글자인지
				boolean b = kC+1 == cW.length(); // 한글인지
				boolean c = cW.charAt(2) ==aa.charAt(0);  //2번위치와 0번위치가 같은지
				if (a && b && c) continue;
					
					
				for(int i=0; i < cW.length(); i++) {
					char ch = cW.charAt(i);
					if('가' <= ch && ch <= '힣') {
						kC++;
					}
				}
				System.out.print(cW.length());
				}
	}	
}
