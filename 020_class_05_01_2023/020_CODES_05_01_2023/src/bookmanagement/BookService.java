package bookmanagement;

import java.util.Scanner;

public class BookService {
	static Book[] book = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index = 0;

//	create book method 
	public void createBook() {
		System.out.println("Enter Book ID : ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Book Name : ");
		String bname = sc.nextLine();

		System.out.println("Enter Author's Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Book Price : ");
		double price = sc.nextDouble();

		book[index] = new Book(id, bname, name, price);
		index++;
		System.out.println("Book Details added Succesfully.");
		System.out.println("===========================================");
	}

	public void getAllBookDetails() {
		for (int i = 0; i < index; i++) {
			System.out.println("===========================================");
			System.out.println(("Book ID : ") + book[i].getBookId());
			System.out.println(("Book ID : ") + book[i].getBookName());
			System.out.println(("Book ID : ") + book[i].getAuthor());
			System.out.println(("Book ID : ") + book[i].getBookPrice());
			System.out.println("===========================================");
		}
	}

	public void getBookDetailsbyId() {
		boolean flag = false;
		System.out.println("Enter Book ID : ");
		int id = sc.nextInt();
		for (int i = 0; i < index; i++) {
			if (id == book[i].getBookId()) {
				System.out.println("===========================================");
				System.out.println(("Book ID : ") + book[i].getBookId());
				System.out.println(("Book ID : ") + book[i].getBookName());
				System.out.println(("Book ID : ") + book[i].getAuthor());
				System.out.println(("Book ID : ") + book[i].getBookPrice());
				System.out.println("===========================================");
				flag =true;
			}
		}
		if(flag==false) {
			System.out.println("Invalid ID. try again.");
			System.out.println("===========================================");
		}
	}
	
	public void getBookDetailsbyName() {
		boolean flag = false;
		System.out.println("Enter Book Name (from second time first click enter then enter the name ): ");
		sc.nextLine();
		String bname = sc.nextLine();
		for (int i = 0; i < index; i++) {
			if (bname.equals(book[i].getBookName())) {
				System.out.println("===========================================");
				System.out.println(("Book ID : ") + book[i].getBookId());
				System.out.println(("Book ID : ") + book[i].getBookName());
				System.out.println(("Book ID : ") + book[i].getAuthor());
				System.out.println(("Book ID : ") + book[i].getBookPrice());
				System.out.println("===========================================");
				flag =true;
			}
		}
		if(flag==false) {
			System.out.println("Invalid name. try again.");
			System.out.println("===========================================");
		}
	}
}
