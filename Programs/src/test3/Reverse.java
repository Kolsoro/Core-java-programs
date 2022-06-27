package test3;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();
       String n="";
       int l=s.length();
       for(int i=0;i<l;i++) {
    	   n+=s.charAt(l-i-1);
       }
       System.out.println(n);
		
		
	}}
