package basic_package;

import java.util.Scanner;

public class AddElements {
	
//	array input
	public static int[] arrInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of elements in array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Input array elements : ");
		for (int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
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
	
	public static void printAarray(int[] arr) {
		int n = arr.length;
		System.out.print("[ ");
		for (int i = 0; i<(n-1);i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[n-1]+" ]");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of elements in array : ");
		int n = sc.nextInt();
		
		System.out.println("First Array : ");
		int[] arr1 = arrInputWithN(n);
		System.out.println("Second Array : ");
		int[] arr2 = arrInputWithN(n);
		int[] finalArr = new int[arr1.length];
		
		for (int i = 0; i<arr1.length;i++) {
			finalArr[i] = arr1[i]+arr2[i];
		}
		
		
		System.out.print("First array : ");
		printAarray(arr1);
		System.out.print("Second array : ");
		printAarray(arr2);
		System.out.print("Final array : ");
		printAarray(finalArr);
		
	}

}
