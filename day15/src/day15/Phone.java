package day15;

public abstract class Phone  {
	
		private String number;
		private String color;
		
		public Phone (String number , String color) {
			this.setNumber(number);
			this.setColor(color);
		}

		public String getNumber() {
			return number;
		}

		private void setNumber(String number) {
			this.number = number;
		}

		public String getColor() {
			return color;
		}

		private void setColor(String color) {
			this.color = color;
		}

		public final void show ()  {
			 System.out.println("정보출력" + getColor() + getNumber() ); 
		}
		public abstract void call() ;  //같은메서드지만 내용을다르게 입력가능 삼성이나 애플마다 출력문구가 다르니
		public abstract void sms() ;
}
