package oop.method4;

public class Menu {
	
		String name;
		String catego;
		int price;
		int dis;
		
		
		
		void infor() {
			if(dis != 0) {
				System.out.println("행사중"+this.name +"\t"+ this.catego );
				System.out.println(this.price - (this.price *(dis/100d)));
				System.out.println();
			}else {
				System.out.println(this.name +"\t"+ this.catego );
				System.out.println(this.price );
				System.out.println();
			}
		}
		
		void data(String name,String catego, int price,int dis) {
			this.name = name;
			this.catego = catego;
			this.price=price;
			this.dis=dis;
			
		}

}
