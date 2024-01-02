package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T08사다리게 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		
		List<String> a= new ArrayList<>(); //배열을못쓰는이유 인원수나 당첨항목을 미리정할수없기때문
		List<String> b= new ArrayList<>();
		System.out.println("인원수입력");
		int zzz = scsc.nextInt();			//인원수 입력
		//나는 스캐너next써서 상관없는데  nextLine썻으면 여기서  nextLine을 한번더써야함
		
		for(int i=0; i < zzz; i++) { //배열 3회 입력
			System.out.println("이름입력");
			a.add(scsc.next());
			System.out.println("당첨항목");
			b.add(scsc.next());
		}
		Collections.shuffle(b);  	//b 셔플
		
		for(int i=0; i < a.size(); i++) {
			System.out.println(a.get(i) + "-" + b.get(i));
		}
	}

}
