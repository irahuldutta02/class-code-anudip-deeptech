package BatchManagement;

public class Java {
	private int stdID;
	private String stdName;
	private long phone;
	private String email;
	public Java(int stdID, String stdName, long phone, String email) {
		super();
		this.stdID = stdID;
		this.stdName = stdName;
		this.phone = phone;
		this.email = email;
	}
	public Java() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
