package default_package;

import java.util.Scanner;

public class duplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Input array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] freq = new int[arr.length];

		System.out.println("Duplicate elements :");
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] == arr[j]) {
					freq[arr[i]]++;
					break;
				}
			}
		}
		
		
		for(int i = 0; i<freq.length;i++) {
			if (freq[i] == 0) {
				continue;
			}else {
				System.out.println("In the array "+ i + " is "+freq[i] +" times.");
			}
		}
		
//		System.out.println("Number :");
//
//		int c =sc.nextInt();
//		
//		System.out.println("Frequancy of "+ c + " is "+ (freq[c]+1));
		
		
	}

}
