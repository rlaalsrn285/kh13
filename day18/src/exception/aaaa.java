package exception;

public class aaaa {

	public static void main(String[] args) {
		
		String regex ="^[0-9]{4}\\-[0-9]{2}$";
		
		try {
		String birth = "2000-11";
		if(birth.length() < 7) {
			throw new Exception("7자리 미만입력");
		}
		else if(birth.matches(regex) == false) {
			throw new Exception("숫자이외입력");
		}
		
		
		String birthA = birth.replace("-","");
        String a = birthA.substring(0);
        int aa = Integer.parseInt(a);
        
        int to = 202312;
        
        int ageK = (to - aa)/100 +1;
        int age = (to - aa) /100;
		}
		catch(Exception err) {
			if(err.getMessage() == null) {
				System.err.println("예외발생");
			}else {
				System.err.println(err.getMessage());
			}
			
		}
	}
}
