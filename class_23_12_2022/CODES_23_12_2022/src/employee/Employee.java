package employee;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	final double specialAllowance = 250.80;
	final double hra = 1000.50;
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	public double calculateSalary() {
		double salary = (basicSalary +(basicSalary * specialAllowance/100)+(basicSalary*hra/100));
		return salary;
	}
	
	public void calculatetransportAllowance(){
		double transportAllowance = ((10*basicSalary)/100);
		System.out.println("| Transport Allowance: "+ transportAllowance);
	}
	
	public void displayDetails(){
		System.out.println("| Employee ID: "+ employeeId);
		System.out.println("| Employee NAME: "+ employeeName);
		System.out.println("| Employee Address: "+ employeeAddress);
		System.out.println("| Employee Phone: "+ employeePhone);
	}
	
}

class Manager extends Employee{
	
	final String employeeType = "Manager";

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = salary;
	}
	
	public void calculatetransportAllowance(){
		double transportAllowance = ((15*basicSalary)/100);
		System.out.println("| Transport Allowance: "+ transportAllowance);
	}
}

class Trainee extends Employee{
	final String employeeType = "Trainee";

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		
		this.basicSalary = salary;
	}
	
}