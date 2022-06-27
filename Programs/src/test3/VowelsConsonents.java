package test3;

import java.util.Scanner;

public class VowelsConsonents {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("type string ");
		String s = sc.nextLine();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowels++;
			} else if (s.charAt(i) > 'a' && s.charAt(i) <= 'z') {
				consonants++;
			}
		}
		System.out.println("The number of vowels: "+vowels);
		System.out.println("The number of consonants: "+consonants);

	}
}
