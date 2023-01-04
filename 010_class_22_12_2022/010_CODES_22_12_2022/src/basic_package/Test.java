package basic_package;

public class Test {

	public static void main(String[] args) {
		StudentNew s1 = new StudentNew();
		
		s1.setId(101);
		s1.setFirstName("Rahul");
		s1.setLastName("Dutta");
		s1.setAddress("Midnapore");
		
		System.out.println(s1.getId()+ ") "+s1.getFirstName()+" "+s1.getLastName()+"'s "+" home is in "+ s1.getAddress()+".");
	}
}
