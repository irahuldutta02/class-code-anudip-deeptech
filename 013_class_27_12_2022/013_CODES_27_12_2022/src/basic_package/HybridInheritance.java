package basic_package;

class GOV{
	void display() {
		System.out.println("Gov regulates all institutions.");
	}
}

//single inheritance 
class RBI extends GOV{
	void display() {
		System.out.println("Banks are regulated by RBI.");
	}
	void info() {
		System.out.println("RBI is a government organigation.");
	}
}


// hierarchical inheritance 
class SBI extends RBI{
	void interestRate() {
		System.out.println("In SBI current RBI approved Interest rate is 6.5%.");
	}
}

class ICICI extends RBI{
	void interestRate() {
		System.out.println("In ICICI current RBI approved Interest rate is 7.5%.");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		//object of GOV class
		GOV indiaGov = new GOV();
		indiaGov.display();
		
		//object of RBI class which inherits GOV
		RBI rbi = new RBI();
		rbi.info();
		
		//object of SBI class which inherits RBI
		SBI sbi = new SBI();
		sbi.display();
		sbi.interestRate();
		
		//object of ICICI class which also inherits RBI
		ICICI icici = new ICICI();
		icici.display();
		icici.interestRate();
	

	}

}
