package test3;

import java.util.Scanner;

public class NParts {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("type string : ");
		String s = scanner.nextLine();
		System.out.println(s.substring(3,6));;
		System.out.println("type how many parts u want to divide : ");
		int n = scanner.nextInt(), t = n;

		String c[] = new String[n];
		for (int i = 0; i < n; i++) {
			c[i] = "";
		}
		int start = 0;
		int end = s.length() / n + 1;
		int count = 0;
		while (t > 0) {

			for (int i = start; i < end; i++) {
				c[count] += s.charAt(i);
			}
			start = end;
			if (s.length() - end < s.length() / n) {
				end = s.length();
			} else
				end += s.length() /n +1;

			count++;
			t--;
		}
		for(String x:c)
			System.out.print(x+" | ");

	}

}
