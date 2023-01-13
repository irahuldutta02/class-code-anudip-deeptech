package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> aList = new ArrayList<Student>();

		aList.add(new Student(101, "Rahul", 3));
		aList.add(new Student(103, "Anrita", 1));
		aList.add(new Student(102, "Lokesh", 2));

		System.out.println("Sorted by Name --------");
		Collections.sort(aList, new NameComparator()); // name comparator

		Iterator<Student> itr = aList.iterator();

		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println(s.id + " " + s.name + " " + s.roll);
		}

		System.out.println();

		System.out.println("Sorted by ID --------");
		Collections.sort(aList, new IdComparator()); // id comparator

		Iterator<Student> itr1 = aList.iterator();

		while (itr1.hasNext()) {
			Student s = (Student) itr1.next();
			System.out.println(s.id + " " + s.name + " " + s.roll);
		}

		System.out.println();

		System.out.println("Sorted by Roll --------");
		Collections.sort(aList, new RollComparator()); // roll comparator

		Iterator<Student> itr2 = aList.iterator();

		while (itr2.hasNext()) {
			Student s = (Student) itr2.next();
			System.out.println(s.id + " " + s.name + " " + s.roll);
		}

	}

}
