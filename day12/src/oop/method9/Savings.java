package oop.method9;

public class Savings {

		String name;
		double baseRate;
		double speRate;
		int monD;
		int invT;
		
		void data(String name, double baseRate, double speRate, int monD,int invT) {
			this.name = name;
			this.baseRate = baseRate;
			this.speRate = speRate;
			this.monD =monD;
			this.invT = invT;
		}
			
		int getexI() { //예상이자
			return (int)((this.monD*12*this.invT) * (this.baseRate/100));
		}
			
		int getyearM(){ //1년 예금해야할돈
			return this.monD*12;
		}
			
		int getexMA(){ //만기예상금액
			return this.getexI() + (this.monD*12*invT );
		}
		
		void print() {
			System.out.println(this.name);
			System.out.println("예상이자"+this.getexI() +"원");
			System.out.println("1년예금액" +this.getyearM() +"원" );
			System.out.println("만기예상금액"+ this.getexMA()  );
			if(this.invT <= 3) {
				System.out.println("비과세상품입니");
			}System.out.println();
		}
}
