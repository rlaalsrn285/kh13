package api.lang.string2;

public class Te05날짜검사 {

	public static void main(String[] args) {
			
		String to = "19951211";
		
		String a = "^[1|2][9|0][0-9]{2}(0[0-9]|1[0-2])(0[0-9]|1-2[0-9]|3[0-1])$";
		
		
		
		if(to.matches(a)) {
			System.out.println("정상날짜");
		}else {
			System.out.println("비정상날짜");
		}
	}

}
