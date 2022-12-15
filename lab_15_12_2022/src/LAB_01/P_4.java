//write a program to print multiplication table
package LAB_01;

import java.util.Scanner;

public class P_4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			for(int i = 1; i <= 10; ++i)
			{
			    System.out.printf("%d * %d = %d \n", num, i, num * i);
			}
		}
    }
}
