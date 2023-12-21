package oop.totla1;

public class TimeCal {
	
		private int hours;
		private int minutes;
		private int seconds;
		
		public TimeCal (int seconds) {
			this(0,0,seconds);
		}
		
		public TimeCal (int minutes, int seconds) {
			this(0,minutes,seconds);
		}
		
		public TimeCal (int hours, int minutes, int seconds) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
		
		private int tosec() {
			return this.seconds + (this.minutes*60) + (this.hours*600);
		}
		
		int getHours() {
			return  tosec()/(60*60);
		}
		int getMinutes() {
			return tosec() % (60*60);
		}
		int getSeconds() {
			return tosec() % (60*60*60);
		}
		
		void show() {
			System.out.print( getHours() +"시" + getMinutes() + "분" + getSeconds() + "초");
			System.out.println(tosec());
		}
}
