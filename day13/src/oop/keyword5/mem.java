package oop.keyword5;

public class mem {
	
	private final String  id;
	private String password;
	
	public mem(String id, String password) {
		this.id = id;
		this.setPassword (password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}
}
