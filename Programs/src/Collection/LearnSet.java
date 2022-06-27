package Collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
	public static void main(String args[]) {

		Set<Student> set=new HashSet<>();
		set.add(new Student("Samer", 2));
		set.add(new Student("kamal", 3));
		set.add(new Student("raj", 4));
		set.add(new Student("Samer", 2));
		
		System.out.println(set);
	}
}
