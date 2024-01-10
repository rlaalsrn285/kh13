package jdbc.dto;

public class PocketmonDto {

	private int pocketmonNo;
	private String pocketmonName;
	private String pocketmonType;
	//필드를 만들고 추가로 setter/getter/기본생성자를 구현
	public int getPocketmonNo() {
		return pocketmonNo;
	}
	public PocketmonDto() {
		super();
	}
	public void setPocketmonNo(int pocketmonNo) {
		this.pocketmonNo = pocketmonNo;
	}
	public String getPocketmonName() {
		return pocketmonName;
	}
	public void setPocketmonName(String pocketmonName) {
		this.pocketmonName = pocketmonName;
	}
	public String getPocketmonType() {
		return pocketmonType;
	}
	public void setPocketmonType(String pocketmonType) {
		this.pocketmonType = pocketmonType;
	}
}
