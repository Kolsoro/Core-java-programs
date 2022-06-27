package test3;

import java.util.Scanner;

public class MaxVisited {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();

		int v = -1;
		int[] c = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != v) {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						c[j] = v;
						c[i] += 1;
					}
				}
			}
		}
		int max = 0;
		int p = 0;
		for (int i = 0; i < c.length; i++) {
			if (max < c[i]) {
				max = c[i];
				p = i;
			}
		}
		System.out.println(s.charAt(p));
	}
}
