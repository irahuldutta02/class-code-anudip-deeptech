package CODES_01;
class Addition{
	public void add(int a) {
		System.out.println("Addition : "+ (a+10));
	}
	public void add(int a, int b) {
		System.out.println("Addition : "+ (a+b));
	}
	public void add(double a, double b) {
		System.out.println("Addition : "+ (a+b));
	}
	public void add(double a, double b, double c) {
		System.out.println("Addition : "+ (a+b+c));
	}
	
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Addition a = new Addition();
		 a.add(10);
		 a.add(10.20, 10.50);
		 a.add(10, 30);
		 a.add(10.50, 12.50, 60.35);
		
	}

}
