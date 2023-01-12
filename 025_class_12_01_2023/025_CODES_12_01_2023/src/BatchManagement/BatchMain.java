package BatchManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		Scanner sc = new Scanner(System.in);
		BatchServices batch = new BatchServices();
		System.out.println("Welcome ! ");

		do {
			System.out.println("Choice: \n1) JAVA \n2) AWS \n3) Others \n4) Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				int ch;
				System.out.println("<----- JAVA BATCH ----->");
				System.out.println("Choice: \n1) Enter Student Info \n2) Show all student \n3) Update student Info");
				ch = sc.nextInt();
				switch (ch) {
				case 1 -> {
					batch.javaStudentInfo();
				}
				case 2 -> {
					batch.getAllJavaStudentDetails();
				}
				case 3 -> {
					batch.updateJavaStudentDetails();
				}
				default -> {
					System.out.println("Invalid input try again!");
				}

				}

			}
			case 2 -> {
				int ch;
				System.out.println("<----- AWS BATCH ----->");
				System.out.println("Choice: \n1) Enter Student Info \n2) Show all student \n3) Update student Info");
				ch = sc.nextInt();
				switch (ch) {
				case 1 -> {
					batch.awsStudentInfo();
				}
				case 2 -> {
					batch.getAllAwsStudentDetails();
				}
				case 3 -> {
					batch.updateAwsStudentDetails();
				}
				default -> {
					System.out.println("Invalid input try again!");
				}

				}
			}
			case 3 -> {
				String batchInput;
				System.out.println("<----- OTHERS BATCH ----->");
				System.out.println("Input : ");
				batchInput = br.readLine();
				
				if(batchInput.equalsIgnoreCase("java")){
					int ch;
					System.out.println("<----- JAVA BATCH ----->");
					System.out.println("Choice: \n1) Enter Student Info \n2) Show all student \n3) Update student Info");
					ch = sc.nextInt();
					switch (ch) {
					case 1 -> {
						batch.javaStudentInfo();
					}
					case 2 -> {
						batch.getAllJavaStudentDetails();
					}
					case 3 -> {
						batch.updateJavaStudentDetails();
					}
					default -> {
						System.out.println("Invalid input try again!");
					}

					}

				}else if(batchInput.equalsIgnoreCase("aws")){
					int ch;
					System.out.println("<----- AWS BATCH ----->");
					System.out.println("Choice: \n1) Enter Student Info \n2) Show all student \n3) Update student Info");
					ch = sc.nextInt();
					switch (ch) {
					case 1 -> {
						batch.awsStudentInfo();
					}
					case 2 -> {
						batch.getAllAwsStudentDetails();
					}
					case 3 -> {
						batch.updateAwsStudentDetails();
					}
					default -> {
						System.out.println("Invalid input try again!");
					}

					}
				}else {
					System.err.println("Course Not Found");
				}
				

			}
			case 4 -> {
				System.out.println("Exited! thank you.");
				System.exit(0);
			}
			default -> {
				System.out.println("Invalid input try again!");
			}

			}

		} while (true);

	}

}
