package basic_package;

import java.util.Arrays;
import java.util.Scanner;

public class EnterArrayElemetAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Input array elements : ");
		for (int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array : "+Arrays.toString(arr));
		System.out.println("---------------------------");
		
		while(true) {
			System.out.println("Enter  1 to change array\nEnter -1 to exit");
			int c = sc.nextInt();
			if(c == -1 || c<-1 || c == 0|| c>1) {
				System.out.println("Exited.");
				break;
			}else{
				System.out.print("Position < space > Element : ");
				int pos = sc.nextInt();
				int ele = sc.nextInt();
				if(pos > arr.length) {
					System.out.println("Invalid Position try again.");
					System.out.println("---------------------------");
				}else {
					arr[pos-1]=ele;
					System.out.println("New Array : "+Arrays.toString(arr));
					System.out.println("---------------------------");
				}
			}
		}
		sc.close();
		
	}

}
