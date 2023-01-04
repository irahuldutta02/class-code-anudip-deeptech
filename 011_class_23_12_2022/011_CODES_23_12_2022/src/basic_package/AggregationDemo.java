package basic_package;

class Company{
	int id;
	String name;
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Company(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address =address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class AggregationDemo {

	public static void main(String[] args) {
		Address address1 = new Address("Kolkata", "West Bengal", "India", 700001);
		Address address2 = new Address("New york city", "New york", "USA", 100001);
		
		
		
		Company company1 = new Company(101, "Anudip", address1);
		Company company2 = new Company(102, "Anudip USA", address2); 
		
		System.out.println("1st Company name: "+ company1.getName());
		System.out.println("Address: "+ company1.getAddress().city);
		
		System.out.println();
		
		System.out.println("2nd Company name: "+ company2.getName());
		System.out.println("Address: "+ company2.getAddress().city);

	}

}
