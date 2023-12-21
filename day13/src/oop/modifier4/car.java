package oop.modifier4;

public class car {
	
		private String name;
		private int speed;
		
		public car(String name, int speed) {
			this.setName (name);
			this.setSpeed (speed);
		}
		String getName() {
			return name;
		}
		void setName(String name) {
			this.name = name;
		}
		int getSpeed() {
			return speed;
		}
		void setSpeed(int speed) {
			this.speed = speed;
		}
		void infor() {
			System.out.println("이름" + this.name);
			System.out.println("속도" + this.speed);
		}
		
}
