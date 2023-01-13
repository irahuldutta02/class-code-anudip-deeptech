package basic;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.roll == o2.roll) {
			return 0;
		} else if (o1.roll > o2.roll) {
			return 1;
		} else {
			return -1;
		}
	}

}
