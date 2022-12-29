package basic_package;

import java.util.Scanner;

public class MinMaxarray {
	
//	array input with n
	public static int[] arrInputWithN(int n) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		System.out.print("Input array elements : ");
		for (int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
//minimum & maximum value in an array	
	public static void minMaxArr(int[] arr) {
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i<n;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		for (int i = 0; i<n;i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Min Value in the array is : "+ min);
		System.out.println("Max value in the array is : "+ max);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of elements in array : ");
		int n = sc.nextInt();
	
		int[] arr = arrInputWithN(n);
		minMaxArr(arr);
		
	}

}
