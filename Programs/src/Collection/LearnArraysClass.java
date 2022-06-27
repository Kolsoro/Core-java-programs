package Collection;

import java.util.Arrays;

public class LearnArraysClass {
	
	public static void main(String args[]) {
		
		int[]  numbers= {10,2,32,12,15,76,17,48,79,81,90};
		Arrays.sort(numbers);
		Arrays.fill(numbers, 12);
		for(int i:numbers)
			System.out.print(i+" ");
		
		
	}

}
