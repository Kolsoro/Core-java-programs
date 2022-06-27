package test3;

import java.util.Scanner;

public class Palindrone {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();
       StringBuffer b=new StringBuffer(s);
       b=b.reverse();
       String n=b.toString();
       System.out.println(s.equals(n));
		
		
		
}}
