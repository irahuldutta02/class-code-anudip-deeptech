import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {23, 56, 77, 90, 45};
		
		int ele = 45;
		
		Arrays.sort(arr);

		int res  = Arrays.binarySearch(arr, ele);
		
		System.out.println("Element found at index : "+ (res+1));

	}

}
