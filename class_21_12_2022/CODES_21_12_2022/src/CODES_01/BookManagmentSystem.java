package CODES_01;

import java.util.Scanner;

class Book {
	String name;
	int id;
	int price;
	String author;
	static String lname = "kolkata Book Hall";
	String av;

	public void createBook(String name, int id, int price, String author, String av) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.author = author;
		this.av = av;
	}

	public void displayBookName() {
		System.out.println(name);
	}

	public void displayBookDetails() {
		System.out.println("NAME : " + name);
		System.out.println("ID : " + id);
		System.out.println("PRICE : " + price);
		System.out.println("AUTHOR : " + author);
		System.out.println("LIBRERY : " + lname);
		System.out.println("AVAILABLITY : " + av);
	}

	public void availablity() {
		if (this.av == "yes") {
			System.out.println("-----------------------------------------");
			System.out.println(this.name + " book is Available to borrow.");
		} else {
			System.out.println("-----------------------------------------");
			System.out.println(this.name + " book is Not Available.");
		}
	}

}

public class BookManagmentSystem {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.createBook("Test1", 20, 20, "test1", "yes");
		System.out.print("1) ");
		book1.displayBookName();
		Book book2 = new Book();
		book2.createBook("Test2", 21, 21, "test2", "yes");
		System.out.print("2) ");
		book2.displayBookName();
		Book book3 = new Book();
		book3.createBook("Test2", 22, 23, "test3", "yes");
		System.out.print("3) ");
		book3.displayBookName();
		Book book4 = new Book();
		book4.createBook("Test2", 23, 23, "test4", "yes");
		System.out.print("4) ");
		book4.displayBookName();
		Book book5 = new Book();
		book5.createBook("Test2", 24, 24, "test5", "no");
		System.out.print("5) ");
		book5.displayBookName();

		do {
			System.out.println("-----------------------------------------");
			System.out.println("1. Display book\n2. Borrow Book\n3. Exit");
			System.out.println("-----------------------------------------");
			System.out.print("Input : ");
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
			if (c == 1) {
				System.out.println("-----------------------------------------");
				System.out.println("Which Book no ?");
				System.out.print("1) ");
				book1.displayBookName();
				System.out.print("2) ");
				book2.displayBookName();
				System.out.print("3) ");
				book3.displayBookName();
				System.out.print("4) ");
				book4.displayBookName();
				System.out.print("5) ");
				book5.displayBookName();
				System.out.println("-----------------------------------------");
				System.out.print("Input : ");
				int c2 = sc.nextInt();
				switch (c2) {
				case 1:
					System.out.println("-----------------------------------------");
					book1.displayBookDetails();
					break;
				case 2:
					System.out.println("-----------------------------------------");
					book2.displayBookDetails();
					break;
				case 3:
					System.out.println("-----------------------------------------");
					book3.displayBookDetails();
					break;
				case 4:
					System.out.println("-----------------------------------------");
					book4.displayBookDetails();
					break;
				case 5:
					System.out.println("-----------------------------------------");
					book5.displayBookDetails();
					break;
				default:
					System.out.println("-----------------------------------------");
					System.out.println("Invalid input");
					break;
				}
				continue;
			} else if (c == 2) {
				System.out.println("-----------------------------------------");
				System.out.println("Which Book no ?");
				System.out.print("1) ");
				book1.displayBookName();
				System.out.print("2) ");
				book2.displayBookName();
				System.out.print("3) ");
				book3.displayBookName();
				System.out.print("4) ");
				book4.displayBookName();
				System.out.print("5) ");
				book5.displayBookName();
				System.out.println("-----------------------------------------");
				System.out.print("Input : ");
				int c3 = sc.nextInt();
				switch (c3) {
				case 1:
					book1.availablity();
					break;
				case 2:
					book2.availablity();
					break;
				case 3:
					book3.availablity();
					break;
				case 4:
					book4.availablity();
					break;
				case 5:
					book5.availablity();
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				continue;
			} else if (c == 3) {
				System.out.println("--------------");
				System.out.println("| Thank you. |");
				System.out.println("--------------");
				break;
			} else {
				System.out.println("------------------------------");
				System.out.println("| Invalid input try again... |");
				System.out.println("------------------------------");
				continue;
			}

		} while (true);
	}

}
