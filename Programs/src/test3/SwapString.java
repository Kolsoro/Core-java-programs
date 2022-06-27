package test3;
import java.util.Scanner;
public class SwapString {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1=s.nextLine();
		System.out.println("Enter second string :");
		String s2=s.nextLine();
		s1=s1.concat(s2);
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length(),s1.length());
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
	}

}
