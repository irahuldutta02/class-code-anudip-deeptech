package bookmanagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookService bService = new BookService();
		int ch;

		do {
			System.out.println("Welcome to Book management System.");
			System.out.println("1) Create Book Details.\n" + "2) Get book details by ID.\n"
					+ "3) Get all book details\n" + "4) Get book details by name\n"+ "5) Get book Details by author name.\n" + "6) Exit");
			System.out.println("===========================================");
			System.out.println("Input : ");
			ch = sc.nextInt();

			switch (ch) {
			case 1: {
				bService.createBook();
				System.out.println();
				break;
			}
			case 2: {
				bService.getBookDetailsbyId();
				System.out.println();
				break;
			}
			case 3: {
				bService.getAllBookDetails();
				System.out.println();
				break;
			}
			case 4: {
				bService.getBookDetailsbyName();
				System.out.println();
				break;
			}
			case 5:{
				bService.getBookdetailsbyAuthor();
				System.out.println();
				break;
			}

			case 6: {
				System.out.println("Thank you.");
				System.exit(0);
			}
			default: {
				System.out.println("Invalid input try again");
			}
			}

		} while (ch != 6);
	}

}
