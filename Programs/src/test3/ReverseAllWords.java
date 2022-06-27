package test3;

import java.util.Scanner;

public class ReverseAllWords {
	
	public static String reverseString(String s) {
		if(s.isEmpty())
			return s;
		return reverseString(s.substring(1))+s.charAt(0);
	}

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter string :");
		String s =sc.nextLine();
		String r=reverseString(s);
		System.out.println("Reverse string is : "+r);
		
		
		
		
//		String words[]=line.split(" ");
//		String revWords[]=new String[words.length];
//		for(int i=0;i<words.length;i++) {
//			String r="";
//			for(int j=0;j<words[i].length();j++) {
//				r+=words[i].charAt(words[i].length()-1-j);
//			}
//			revWords[i]=r;
//		}
//		System.out.println("Reverse words are :");
//		for(String s:revWords) {
//			System.out.print(s+" ");
//		}
//		
		
	}
	
}
