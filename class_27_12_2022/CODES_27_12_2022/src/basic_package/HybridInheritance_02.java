package basic_package;

//Multiple inheritance 
interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Project implements Printable, Showable {
	public void print() {
		System.out.println("Printing Project.");
	}

	public void show() {
		System.out.println("Showing Project.");
	}
}

//hierarchical inheritance
class SchoolProject extends Project {
	public void print() {
		System.out.println("Printing School Project.");
	}

	public void show() {
		System.out.println("Showing School Project.");
	}
}

class CollegeProject extends Project {
	public void print() {
		System.out.println("Printing College Project.");
	}

	public void show() {
		System.out.println("Showing College Project.");
	}
}

public class HybridInheritance_02 {

	public static void main(String args[]) {
		//Project object
		Project project1 = new Project();
		project1.print();
		project1.show();

		System.out.println();

		//SchoolProject object
		SchoolProject sp1 = new SchoolProject();
		sp1.print();
		sp1.show();

		System.out.println();

		//CollegeProject object
		CollegeProject cp1 = new CollegeProject();
		cp1.print();
		cp1.show();

	}

}
