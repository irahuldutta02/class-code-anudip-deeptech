package basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Rahul");
		list.add("Test 2");
		list.add("Test3");
		list.add("Test4");
		
		System.out.println("Normal printing");
		System.out.println(list);
		
		System.out.println();

		System.out.println("Using For each loop : ");
		for (String i : list) {
			System.out.println(i + " ");
		}

		System.out.println();

		System.out.println("Using While loop : ");
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i) + " ");
			i++;
		}

		System.out.println();

		System.out.println("Using java 8 stream : ");
		list.stream().forEach(System.out::println);

		System.out.println();

		System.out.println("Using Arrays class : ");
		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println();

		System.out.println("Using list Iterator : ");
		ListIterator<String> list_itr = list.listIterator(0);
		
		while(list_itr.hasNext()) {
			System.out.println(list_itr.next());
		}
		
		
		

	}

}
