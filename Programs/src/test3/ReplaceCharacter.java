package test3;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();
		System.out.println("Enter Character to replace :");
		String r = sc.next();
		StringBuffer n = new StringBuffer(s);
		s=s.replaceAll("\\s", r);
		System.out.println(s);

	}

}
