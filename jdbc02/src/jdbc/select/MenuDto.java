package jdbc.select;

public class MenuDto {
		private int menuN;
		private String mNK;
		private String mNE;
		private String mT;
		private int price;
		
		public int getMenuN() {
			return menuN;
		}
		public MenuDto() {
			super();
		}
		public void setMenuN(int menuN) {
			this.menuN = menuN;
		}
		public String getmNK() {
			return mNK;
		}
		public void setmNK(String mNK) {
			this.mNK = mNK;
		}
		public String getmNE() {
			return mNE;
		}
		public void setmNE(String mNE) {
			this.mNE = mNE;
		}
		public String getmT() {
			return mT;
		}
		public void setmT(String mT) {
			this.mT = mT;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
}
