package Array;

import java.util.Scanner;

public class OddEvenSum {
	
	public static void oddEvenSum(int[] arr) {
		int cOdd = 0;
		int cEven = 0;
		
		for (int i = 0; i<arr.length;i++) {
			if (arr[i]%2 == 0) {
				cEven++;
			}else {
				cOdd++;
			}
		}
		System.out.println("Even : "+ cEven);
		System.out.println("Odd : " + cOdd);
		
	}

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
		oddEvenSum(arr);
	}

}
