package Collection;

import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String args[]) {

		Map<String, Integer> numbers = new TreeMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		numbers.put("five", 5);

		numbers.remove("three");
		
		System.out.println(numbers);

//for (Map.Entry<String, Integer> e : numbers.entrySet()) {
//			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		} 

//		for (String key : numbers.keySet()) {
//			System.out.println(key);
//		}
//		for(int value:numbers.values()) {
//			System.out.println(value);
//		}
		
//		System.out.println(numbers.containsKey("One"));
//		System.out.println(numbers.containsValue(3));
//		
		
		

	}
}
