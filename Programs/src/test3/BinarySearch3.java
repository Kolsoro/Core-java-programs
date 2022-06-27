package test3;

import java.util.Arrays;

public class BinarySearch3 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 19, 30, 40, 50, 60, 90, 70, 85, 100 };
		Arrays.sort(a);

		int i=Arrays.binarySearch(a, 85);
		if(i<0)
			System.out.println("Not present");
		else {
			System.out.println("key present at :"+i);
		}
		
	}

}
