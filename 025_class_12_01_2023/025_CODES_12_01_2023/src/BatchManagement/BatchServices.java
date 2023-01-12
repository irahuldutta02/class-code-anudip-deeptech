package BatchManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BatchServices {

	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Java[] java = new Java[20];
	static Aws[] aws = new Aws[20];
	static int id;
	static long phone;
	static String name, email;
	static int jIndex = 0;
	static int aIndex = 0;

	public void javaStudentInfo() throws IOException {
		System.out.println("<------- ENTER JAVA BATCH STUDENT DETAILS ------->");
		System.out.println("Enter student ID: ");
		id = sc.nextInt();
		System.out.println("Enter student Name : ");
		name = br.readLine();
		System.out.println("Enter phone Number : ");
		phone = sc.nextLong();
		System.out.println("Enter Email : ");
		email = br.readLine();

		java[jIndex] = new Java(id, name, phone, email);
		jIndex++;
		System.out.println("Student details added");
		System.out.println("===============================================");
	}

	public void getAllJavaStudentDetails() {
		boolean flag = false;
		System.out.println("<------- ALL JAVA BATCH STUDENT DETAILS ------->");
		for (int i = 0; i < jIndex; i++) {
			System.out.println("===============================================");
			System.out.println("Student ID    : " + java[i].getStdID());
			System.out.println("Student Name  : " + java[i].getStdName());
			System.out.println("Student Phone : " + java[i].getPhone());
			System.out.println("Student Email : " + java[i].getEmail());
			System.out.println("===============================================");
			flag = true;
		}
		
		if(flag==false) {
			System.err.println("No Student Found");
		}

	}

	public void updateJavaStudentDetails() throws IOException {
		System.out.println("<------- UPDATE JAVA BATCH STUDENT DETAILS ------->");
		System.out.println("Student ID : ");
		id = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < jIndex; i++) {
			if (id == java[i].getStdID()) {
				System.out.println("Enter student ID: ");
				id = sc.nextInt();
				System.out.println("Enter student Name : ");
				name = br.readLine();
				System.out.println("Enter phone Number : ");
				phone = sc.nextLong();
				System.out.println("Enter Email : ");
				email = br.readLine();
				java[i] = new Java(id, name, phone, email);
				System.out.println("Student details updated");
				System.out.println("===============================================");

			} else {
				throw new StudentNotFoundException("Student not Found.");
			}
			flag = true;
		}
		if(flag==false) {
			System.err.println("No Student Found");
		}

	}

	public void awsStudentInfo() throws IOException {
		System.out.println("<------- ENTER AWS BATCH STUDENT DETAILS ------->");
		System.out.println("Enter student ID: ");
		id = sc.nextInt();
		System.out.println("Enter student Name : ");
		name = br.readLine();
		System.out.println("Enter phone Number : ");
		phone = sc.nextLong();
		System.out.println("Enter Email : ");
		email = br.readLine();

		aws[aIndex] = new Aws(id, name, phone, email);
		aIndex++;
		System.out.println("Student details added");
		System.out.println("===============================================");
	}

	public void getAllAwsStudentDetails() {
		boolean flag = false;
		System.out.println("<------- ALL AWS BATCH STUDENT DETAILS ------->");
		for (int i = 0; i < aIndex; i++) {
			System.out.println("===============================================");
			System.out.println("Student ID    : " + aws[i].getStdID());
			System.out.println("Student Name  : " + aws[i].getStdName());
			System.out.println("Student Phone : " + aws[i].getPhone());
			System.out.println("Student Email : " + aws[i].getEmail());
			System.out.println("===============================================");
			flag = true;
		}
		if(flag==false) {
			System.err.println("No Student Found");
		}
	}

	public void updateAwsStudentDetails() throws IOException {
		System.out.println("<------- UPDATE JAVA BATCH STUDENT DETAILS ------->");
		System.out.println("Student ID : ");
		id = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < aIndex; i++) {
			if (id == aws[i].getStdID()) {
				System.out.println("Enter student ID: ");
				id = sc.nextInt();
				System.out.println("Enter student Name : ");
				name = br.readLine();
				System.out.println("Enter phone Number : ");
				phone = sc.nextLong();
				System.out.println("Enter Email : ");
				email = br.readLine();
				aws[i] = new Aws(id, name, phone, email);
				System.out.println("Student details updated");
				System.out.println("===============================================");

			} else {
				throw new StudentNotFoundException("Student not Found.");
			}
			flag = true;
		}
		if(flag==false) {
			System.err.println("No Student Found");
		}

	}

}
