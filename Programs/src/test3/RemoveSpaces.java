package test3;

import java.util.Scanner;

public class RemoveSpaces {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string :");
		String s =sc.nextLine();
		System.out.println(newString(s));
	}
	public static String newString(String s) {
	return s.replaceAll("\\s", "!");	
	}

}
