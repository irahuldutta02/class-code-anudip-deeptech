package NORMAL;

import java.util.Scanner;

public class DigitCount {

	public static void printDigitCount(int num) {
		int count = 0;

		for (int i = num; i > 0; i = i / 10) {
			count++;
		}
		System.out.println("There are total "+ count + " digits.");
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input : ");
			int num = sc.nextInt();
			printDigitCount(num);
		}
	}
}
