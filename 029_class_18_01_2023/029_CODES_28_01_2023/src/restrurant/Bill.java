package restrurant;

public class Bill {
	String fname;
	int qty;
	double amt;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(String fname, int qty, double amt) {
		super();
		this.fname = fname;
		this.qty = qty;
		this.amt = amt;
	}
	
	
	
}
