package stream;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String args[]) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		
		System.out.println(values.stream()
				                  .filter(i->i==90)
				                  .findFirst()
				                  .orElse(0));
		                          
		
		
		
		
	}
}