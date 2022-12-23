package employee;

//creating a employee class
public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	final double specialAllowance = 250.80;
	final double hra = 1000.50;
	
	// creating a constructor for employee class
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	// calculating salary for objects
	public double calculateSalary() {
		double salary = (basicSalary +(basicSalary * specialAllowance/100)+(basicSalary*hra/100));
		return salary;
	}
	
	// calculating transport allowance for objects
	public void calculatetransportAllowance(){
		double transportAllowance = ((10*basicSalary)/100);
		System.out.println("| Transport Allowance: "+ transportAllowance);
	}
	
	// displaying employee details
	public void displayDetails(){
		System.out.println("| Employee ID: "+ employeeId);
		System.out.println("| Employee NAME: "+ employeeName);
		System.out.println("| Employee Address: "+ employeeAddress);
		System.out.println("| Employee Phone: "+ employeePhone);
	}
	
}

// creating a manager class which inherits employee class
class Manager extends Employee{
	
	final String employeeType = "Manager";

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = salary;
	}
	
	// overriding a clculatetransportallowance method for managers
	public void calculatetransportAllowance(){
		double transportAllowance = ((15*basicSalary)/100);
		System.out.println("| Transport Allowance: "+ transportAllowance);
	}
}

//creating a trainee class which inherits employee class
class Trainee extends Employee{
	final String employeeType = "Trainee";

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		
		this.basicSalary = salary;
	}
	
}