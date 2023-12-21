package oop.scanner;

public class game {
		
		private String id;
		private String classs;
		private int lv;
		private int gold;
	
		void setId(String id) {
			this.id = id;
		}
		void setClasss(String classs) {
			switch(classs) {
			case "전사" :
			case "도적" :
			case "법사" :
				this.classs = classs;
			}
		}
		void setLv(int lv){
			if(lv < 1) return;
			this.lv = lv;
		}
		void setGold(int gold) {
			if(gold < 0) return;
			this.gold = gold;
		}
	
		game(String id, String classs){
			this(id,classs,1,100);
		}
		game(String id, String classs , int lv, int gold){
			this.setId(id);
			this.setClasss(classs);
			this.setLv(lv);
			this.setGold(gold);
		}
		
		String getId() {
			return id;
		}
		String getclass() {
			return classs;
		}
		int getLv() {
			return lv;
		}
		int getGold() {
			return gold;
		}
		
		
		void print() {
			System.out.println(getId());
			System.out.println(getclass() );
			System.out.println(getLv());
			System.out.println(getGold());
		}

		
		void lvup(){
			this.lv++;
		}
}
