package default_package;

import java.util.Scanner;

public class negetiveNumberInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Input array elements : ");
		for (int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("All negetive numbers is the array are : ");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
