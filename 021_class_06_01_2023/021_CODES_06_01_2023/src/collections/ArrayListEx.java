package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList1 = new ArrayList<Integer>();
		System.out.println(arrList1.size());
		arrList1.add(11);
		arrList1.add(12);
		arrList1.add(13);
		System.out.println(arrList1.size());
		System.out.println(arrList1);
		arrList1.add(14);
		arrList1.add(15);
		System.out.println(arrList1.size());
		System.out.println(arrList1);
		arrList1.add(1,16);
		System.out.println(arrList1);
		arrList1.set(1,10);
		System.out.println(arrList1);
		arrList1.remove(1);
		System.out.println(arrList1);
		arrList1.replaceAll(e -> e*2);
		System.out.println(arrList1);
		
	}

}
