package basic;

import java.util.Scanner;

public class NumberOfOccurance {

	public static int count(String str, String c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == c.toUpperCase().charAt(0))||(str.charAt(i) == c.toLowerCase().charAt(0)) )
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the line : ");
		String str = sc.nextLine();
		System.out.print("Input the character : ");
		String c = sc.nextLine();
		System.out.print("Number of occurance of "+c+" is : ");
		System.out.println(count(str, c));
		sc.close();
	}

}
