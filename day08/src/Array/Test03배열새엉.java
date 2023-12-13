package Array;

public class Test03배열새엉 {

	public static void main(String[] args) {

		int[] aa = new int[] {30,50,20,10,40};
		String[] bb= new String[] {"피카츄","라이츄","파이리","꼬부기"};
		float[] cc = new float[] {177.1f , 152.2f , 199.3f };
		
		for(int i=0; i<aa.length; i++) {
			System.out.println(aa[i]);
		}for(int i=0; i<bb.length; i++) {
			System.out.println(bb[i]);
		}for(int i=0; i<=2; i++) {
			System.out.println(cc[i]);
		}
		System.out.println(aa.length);
	}

}
