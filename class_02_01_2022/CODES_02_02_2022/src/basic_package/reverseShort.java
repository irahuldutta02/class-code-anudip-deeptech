package basic_package;
import java.util.*;

class reverseShort{
	// get reversed array 
	public static void reverse(int[] array)
	{
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		// taking array input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Input array elements : ");
		for (int i = 0; i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		// original array
		System.out.println("Original array : "+ Arrays.toString(array));
		// sorting the array in place
		Arrays.sort(array);
		System.out.println("Shorted array : "+ Arrays.toString(array));
		//reversing the shorted in place
		reverse(array);
		System.out.println("Reversed shorted array : "+Arrays.toString(array));
		
	}

	
}
