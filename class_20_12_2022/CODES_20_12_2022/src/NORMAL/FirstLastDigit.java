package NORMAL;

import java.util.Scanner;

public class FirstLastDigit {
	private static void printFirstLastDigits(int num) {
		// TODO Auto-generated method stub
		int firstDigit = 0;
		int lastDigit = 0;
		for (int i = num; i > 0; i = i / 10) {
			firstDigit = i % 10;
		}
		System.out.println("First digit: " + firstDigit);
		lastDigit = num % 10;
		System.out.println("Last digit: " + lastDigit);
		
	}
	

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input : ");
			int num = sc.nextInt();
			printFirstLastDigits(num);
		}
	}

	
}