package restrurant;

public class Restraurant {

	String fName;
	int price;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Restraurant() {
		super();
	}
	public Restraurant(String fName, int price) {
		super();
		this.fName = fName;
		this.price = price;
	}
	
	public void display() {
		System.out.print(this.fName+" - ");
		System.out.println(this.price);
	}
	
}
