package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String args[]) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("Samer", 2));
		list.add(new Student("kamal", 3));
		list.add(new Student("Raj", 4));
		list.add(new Student("Dev", 5));
		list.add(new Student("Aman", 6));

//		Student s1 = new Student("karan", 6);
//		Student s2 = new Student("sagar", 7);

//		System.out.println(s1.compareTo(s2));

		Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
		System.out.println(list);

//		List<Integer> list = new ArrayList<>();
//		list.add(34);
//		list.add(12);
//		list.add(9);
//		list.add(76);
//		list.add(29);
//		list.add(75);
//		System.out.println("min element " + Collections.min(list));
//		System.out.println("max element " + Collections.max(list));
//		System.out.println(Collections.frequency(list, 9));
//		Collections.sort(list,Comparator.reverseOrder());
//		System.out.println(list);
	}

}
