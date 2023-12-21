package oop.keyword6;

public class Gscreen {

	private final int width;
	private final int height;
	private String title;
	
	public Gscreen(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getResolution() {
		return this.width * this.height;
	}
	
	void print() {
		System.out.println("타이틀"+getTitle());
		System.out.println("해상도" + getResolution() );
		
	}
}
