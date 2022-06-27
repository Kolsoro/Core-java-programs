package test3;

import java.util.Scanner;

public class UpperCase {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s=sc.nextLine();
		StringBuffer n=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i)))
				n.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			else if(Character.isUpperCase(s.charAt(i)))
				n.setCharAt(i, Character.toLowerCase(s.charAt(i)));
		}
		
		System.out.println(n);
	}

}
