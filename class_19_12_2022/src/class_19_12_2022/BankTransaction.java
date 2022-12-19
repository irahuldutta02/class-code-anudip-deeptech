package class_19_12_2022;
// Banking System
import java.util.Scanner;

public class BankTransaction {

	public static void main(String[] args) {
		int bal = 10000;
		try (Scanner sc = new Scanner(System.in)) {
		while(true) {
				System.out.print("Select 1 for Blance Enquary, 2 for Withdraw, 3 for Diposit or 4 to Exit : ");
				char c = sc.next().charAt(0);
				if (c == '4') {
					System.out.println("Exiting the banking system...");
					System.out.println("Exited Thank you for banking with us.");
					break;
				}else {
					switch(c) {
					case '1': System.out.println("Your Blancein your account : "+ bal);
					break;
					
					case '2': System.out.print("Amount to Withdraw : ");
					bal = bal-sc.nextInt();
					System.out.println("New Balance in your account : "+ bal);
					break;
					
					case '3': System.out.print("Amount to diposite : ");
					bal = bal+sc.nextInt();
					System.out.println("New Balance in your account : "+ bal);
					break;
					
					default: System.out.println("Invalid input");
					break;
					}
				}
			}
		}
		
	}

}
