package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T06끝말잇기 {

	public static void main(String[] args) {
		//대부분 잘되었으나 제시어가 배열안에 포함이 안됐음
		// "^[가-힣]{2,6}$"; 변수안넣고 바로도 가능
		// 제시어를 배열안에 미리넣었을때는 지금식과 뭔가 달랏음 완성답 다시볼것 , 
		
		Scanner scsc = new Scanner(System.in);
		List<String> game = new ArrayList<>();
		String regex = "^[가-힣]{2,6}$";   //한글 2이상 6이하인지
		
		System.out.println("끝말잇기 제시어입력");
		String aa = scsc.next();
		
		while(true) {
		System.out.println(aa +" 끝말잇기 입력");
		String bb = scsc.next();
		
		boolean a = bb.charAt(0) == aa.charAt(aa.length()-1); //bb의마지막글자와 aa의 첫글자가 같은지
		boolean b = bb.matches(regex); // 한글 2이상 6이하인지
		boolean c = aa.contains(bb);   // aa에 bb가 있는지
		
		if(!a || !b || c ) {
			break;
		}
		aa = bb;   //이부분이 완성된답이랑 다름 다시볼것
		}
		System.out.println("끝");
	}

}
