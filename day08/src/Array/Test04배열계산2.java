package Array;

public class Test04배열계산2 {

	public static void main(String[] args) {
		
		int[] aa = new int[] {90,67,75,88,52,34};
		int to = 0; //총점수
		for(int i = 0; i<aa.length; i++) {
			to += aa[i];
			if(aa[i] < 60) {
				System.out.println("불합격자");
				System.out.println(aa[i]);
				
			}else if(aa[i] >=90){
				System.out.println("성적우수자");
				System.out.println(aa[i]);
			}
		}System.out.println("총점"+to);
		System.out.println("평균"+
				((double)to/aa.length ));

	}

}
