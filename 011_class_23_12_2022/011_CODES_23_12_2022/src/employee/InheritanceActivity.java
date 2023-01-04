package employee;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager manager1 = new Manager(126534, "Perer", "Chennai India", 237844, 65000);
		System.out.println("|------------------------------------|");
		System.out.println("| Employee Type: "+ manager1.employeeType);
		manager1.displayDetails();
		System.out.println("| Employee Salary: "+ manager1.calculateSalary());
		manager1.calculatetransportAllowance();
		System.out.println("|------------------------------------|");
		
		Trainee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("|------------------------------------|");
		System.out.println("| Employee Type: "+ trainee1.employeeType);
		trainee1.displayDetails();
		System.out.println("| Employee Salary: "+trainee1.calculateSalary());
		trainee1.calculatetransportAllowance();
		System.out.println("|------------------------------------|");
	}

}
