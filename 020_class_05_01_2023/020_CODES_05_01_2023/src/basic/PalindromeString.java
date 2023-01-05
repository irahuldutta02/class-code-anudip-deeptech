package basic;
//WAP to check whether a string is a palindrome or not
import java.util.Scanner;

public class PalindromeString {

	public static void PalindromeOrNot(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		if (str.equals(revStr)) {
			System.out.println("This string is palindrome.");
		}else {
			System.out.println("The string is not palindrome.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the string  : ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		PalindromeOrNot(str);
		
	}

}
