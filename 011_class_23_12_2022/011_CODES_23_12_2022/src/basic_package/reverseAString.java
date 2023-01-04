package basic_package;

public class reverseAString {

	public static void main(String[] args) {
		String a = "RAHUL";
		
		for (int i= (a.length()-1); i>=0;i--) {
			System.out.print(a.charAt(i));
		}

	}

}
