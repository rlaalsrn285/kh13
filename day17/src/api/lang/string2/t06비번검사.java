package api.lang.string2;

public class t06비번검사 {

	public static void main(String[] args) {

			String a ="Aa1@aaaaa";
			String b = "^(?=(.*?)[A-Z]+)(?=(.*?)[a-z]+)(?=(.*?)[0-9]+)(?=(.*?)[!@#$]+)[A-Za-z0-9!@#$]{8,16}$";
			
			System.out.println(a.matches(b));

	}

}
