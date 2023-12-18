package oop.method1;

public class SoccerTeam {
	//멤버 변수 - 데이터
		int rank;
		String name;
		int win, draw, lose;
		
		//멤버 메소드 - 자주 쓰는 코드
		//void 이름() {코드}
		void information() {
			//this = 현재 실행중인 객체(주인공)
			System.out.println("순위 : " + this.rank);
			System.out.println("이름 : " + this.name);
			System.out.println(this.win+"승 " + this.draw+"무 "+this.lose+"패");
		}

		void data(int rank, String name, int win, int draw, int lose) {
			this.rank = rank;
			this.name = name;
			this.win = win;
			this.draw = draw;
			this.lose = lose;

}
}
