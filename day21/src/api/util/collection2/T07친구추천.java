package api.util.collection2;

import java.util.Set;

public class T07친구추천 {

	public static void main(String[] args) {
			//완전잘못된풀이 답코드다시볼것
			Set<String> 피카츄 = Set.of("라이","꼬부");
			Set<String>  라이츄 = Set.of("피카","파이" , "꼬부");
			
			피카츄.equals(라이츄);
			
			System.out.println(피카츄.equals(라이츄));
			
			
	}

}
