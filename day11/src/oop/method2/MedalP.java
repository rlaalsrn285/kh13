package oop.method2;

public class MedalP {

		String name;
		String sport;
		String season;
		int gold;
		int silver;
		int bronze;
		
		void infor() {
			System.out.println(this.name +this.sport + this.season);
			System.out.println(this.gold+"개"+ this.silver+"개" +this.bronze+"개");
		}
		
		void data(String name,String sport,String season,int gold,int silver,int bronze) {
			this.name = name;
			this.sport = sport;
			this.season = season;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}
	}


