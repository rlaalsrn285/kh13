package oop.modifier1;

public class book {
	
	private String title;
	private String author;
	private int price;
	private int page;
	
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setPrice(int price) {
		if(price >= 0) {
		this.price = price;
		}
	}
	
	void data(String title, String author, int price, int page) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.page = page;
	}

		void	 infor() {
			System.out.println("도서정보");
			System.out.println("이름" + this.title);
			System.out.println("저자" + this.author);
			System.out.println("가격" + this.price);
			System.out.println("페이지" + this.page);
		}
}
