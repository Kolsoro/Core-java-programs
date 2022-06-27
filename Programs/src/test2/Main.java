package test2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int arr[] = new int[] { 1, 2, 3, 4, 3, 2, 1, 3, 1, 6, 7, 6, 2, 8, 8 };
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for (int i : arr) 
			if (i % 2 == 0)
				even.add(i);
			else
				odd.add(i);
		System.out.println("Even List:");
		for(int i:even) 
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Odd List:");
		for(int i:odd)
			System.out.print(i+" ");
		
		
		

	}

}
