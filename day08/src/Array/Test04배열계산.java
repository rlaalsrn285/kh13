package Array;

public class Test04배열계산 {

	public static void main(String[] args) {
		
		int[] aa = new int[] {90,67,75,88,52,34};
		int to = 0; //총점수
		int rank = 1; //80점놈 등수
		//for를 두번써서 불합격자 성적우수자 따로 뺄것 같이두면 섞여서나오기때문
		//한번에 다끝내려고 하지말것 ///한번에 하는게 좋은경우도있음 상황에따라 잘선택
		for(int i = 0; i<aa.length; i++) {
			to += aa[i];
			if(aa[i] < 60) {
				System.out.println("불합격자");
				System.out.println(aa[i]);
			}if (aa[i]>80) {
				rank++;
				if(aa[i] >=90){
					System.out.println("성적우수자");
					System.out.println(aa[i]);
				}
				
				
			}
		
		}System.out.println("총점"+to);
		System.out.println("평균"+((double)to/aa.length ));
		System.out.println("80점학생이 전학오면"+ rank +"등");

	}

}
