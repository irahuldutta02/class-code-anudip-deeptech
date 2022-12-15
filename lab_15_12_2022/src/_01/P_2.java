// write a program to check whether a character is alphabet or number

package _01;

import java.util.Scanner;

public class P_2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			char c= sc.next().charAt(0);
			
			if(c>='a' && c<='z') {
				System.out.println("Alphabet");
			}else if(c>='A'&& c<= 'Z'){
				System.out.println("Alphabet");
			}
			else {
				System.out.println("Not Alphabet");
			}
		}
	}

}
