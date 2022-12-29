package Library;

interface LibraryUser {
	public void registerAccount();

	public void requestBook();
}

class KidUsers implements LibraryUser {
	int age;
	String bookType;

	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else if (age > 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}

	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if ((bookType == "Kids") || (bookType == "kids") || (bookType == "KIDS")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

}

class AdultUser implements LibraryUser {
	int age;
	String bookType;

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if (age > 12) {
			System.out.println("You have successfully registered under a Adult Account");
		} else if (age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if ((bookType == "Fiction") || (bookType == "fiction") || (bookType == "FICTION")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}

	}

}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KidUsers kid1 = new KidUsers(10, "Kids");
		KidUsers kid2 = new KidUsers(18, "Fiction");

		kid1.registerAccount();
		kid1.requestBook();

		System.out.println();

		kid2.registerAccount();
		kid2.requestBook();

		System.out.println();
		System.out.println();

		AdultUser adult1 = new AdultUser(5, "Kids");
		AdultUser adult2 = new AdultUser(23, "Fiction");

		adult1.registerAccount();
		adult1.requestBook();

		System.out.println();

		adult2.registerAccount();
		adult2.requestBook();

	}

}
