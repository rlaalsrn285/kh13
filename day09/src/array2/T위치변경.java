package array2;

public class T위치변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열정렬을 할수가 잇음
		//배열을할려면 큰것과 작은것을 구분할수잇어야함 이것들을 바꿔치기하면 정렬의시작
		
		int [] numbers =  new int[] {30,50,20,10,40};
		int backup = numbers[0];
		numbers[0] = numbers[3];
		numbers[3] = backup;
	
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		//한칸에는 데이터한개밖에 못넣음 , 맞교환불가
		//변수하나 추가해서 백업해두고교환 - 이걸 임시변수라고함 temp , tmp 라고함 그래서tmp를 변수명으로사용
		
	}

}
