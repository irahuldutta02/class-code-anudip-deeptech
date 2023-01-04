package basic_package;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElemet {

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
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("---------------------------");

		System.out.print("Enter position to Delete : ");
		int pos = sc.nextInt();

		int[] newArr = new int[arr.length - 1];

		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == pos-1) {
				continue;
			}
			newArr[k++] = arr[i];
		}
		System.out.println("New Array : " + Arrays.toString(newArr));
		System.out.println("---------------------------");

	}

}
