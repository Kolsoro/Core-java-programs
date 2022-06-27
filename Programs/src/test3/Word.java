package test3;

import java.util.Scanner;

public class Word {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();

		String[] a = new String[100];
		int count = 0;
		String word = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			} else {
				a[count] = word;
				count++;
				word = "";
			}
		}

		String max = "";
		String min = a[0];
		for (int i = 0; i < count; i++) {
			if (max.length() < a[i].length())
				max = a[i];
			if (min.length() > a[i].length())
				min = a[i];
		}
		System.out.println(max);
		System.out.println(min);

	}
}
