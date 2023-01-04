package basic;

import java.util.Scanner;

public class CountVowel {
	
	public static int count(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')||(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U')) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("String : ");
		String str = sc.nextLine();
		System.out.println("Total no of vowels in string are: " + count(str));
	}

}
