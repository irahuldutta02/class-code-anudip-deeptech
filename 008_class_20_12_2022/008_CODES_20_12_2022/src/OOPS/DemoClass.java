package OOPS;

class Student{
	int id;
	String name,address;
	long ph;
	
	public void setData(int id, String name , String address, long ph ){
		this.id = id;
		this.name = name;
		this.address = address;
		this.ph = ph;
	}
	
	
	public void getData() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("ADDRESS : " + address);
		System.out.println("PH : " + ph);
	}
}


public class DemoClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		student.setData(101, "Rahul", "Kolkata", 7477690857l);
		student.getData();
	}

}
