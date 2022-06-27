package test3;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=s.nextLine();
		System.out.println("Enter second string");
		String s2=s.nextLine();
		if(s1.length()!=s2.length())
			System.out.println("Not anagram ");
		else {
			//convert these 2 lower case 
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.equals(c1, c2)?" Anagram ":" Not Anagram ");
		}
		
		
		
	}

}
