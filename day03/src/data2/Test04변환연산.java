package data2;

public class Test04변환연산 {

	public static void main(String[] args) {
		//같은숫자여도형태가다를수잇음
		//int는 long보다 작기때문에 자연스럽게 옮길수잇음 묵시적형변환(자동형변환)
		
		int a= 10;
		long b = a;
		//반대의경우는 불가
		//long 에서 int1로는 불가 명시적형변환(강제로형변환)이 필요
		
		long aa = 10L;
		int bb = (int)aa; //명시적형변환한거
		//자료형의크기 비교 int1보다 long1이 더큼 (비트?바이트?수차이?)
		//큰자료형에서 작은자료형으로 명시적형변환하려면 데이터를손실시켜야함

	}

}
