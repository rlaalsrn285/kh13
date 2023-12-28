package api.lang.string2;

public class Te05날짜검사2 {

	public static void main(String[] args) {
			
		String to = "21000507";
		
		String a = "^[1|2][9|0][0-9]{2}[0-1][0-9][0-3][0-9]$";
		String b = "[1|2][9|0][0-9]{2}"; //년도
		String toY =  to.substring(0,3); 
		
		
		
		if(toY.matches(b)) { //년도가 정상이라면
			
		}
	}
}
