package abstruction_demo;

abstract class Bank {
	abstract public void getLoneInterst();

	public void display() {
		System.out.println("This is a Bank under RBI regulations.");
	}
}

class Sbi extends Bank {
	@Override
	public void getLoneInterst() {
		System.out.println("Rate Interest of SBI is 6.5%.");
	}
}

class Hdfc extends Bank {
	@Override
	public void getLoneInterst() {
		System.out.println("Rate Interest of HDFC is 8.5%.");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Sbi sbi1 = new Sbi();
		sbi1.display();
		sbi1.getLoneInterst();
		Hdfc hdfc1 = new Hdfc();
		hdfc1.display();
		hdfc1.getLoneInterst();
	}
}
