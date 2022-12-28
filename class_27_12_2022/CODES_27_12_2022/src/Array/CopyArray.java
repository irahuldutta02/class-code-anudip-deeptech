package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Input array elements : ");
		for (int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		//deep copy
		int[] copyArr = new int[arr.length];
		
		for (int i = 0; i<arr.length;i++) {
			copyArr[i] = arr[i];
		}
		
		System.out.println("Old Array : "+Arrays.toString(arr));
		
		System.out.println("New Array : "+Arrays.toString(copyArr));
		
		int[] copyArr2 = new int[arr.length];
		
		copyArr2 = arr;
		
		
		// shallow copy
		arr[0] = 10;
		
		System.out.println("New Array : "+Arrays.toString(copyArr2));
		
		System.out.println(arr == copyArr2);
		
		sc.close();
		
	}

}
