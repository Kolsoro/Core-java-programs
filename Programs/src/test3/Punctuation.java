package test3;
import java.util.Scanner;
public class Punctuation {

	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("type string ");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='!' ||s.charAt(i)=='.' ||s.charAt(i)=='-' ||s.charAt(i)==';' ||
					s.charAt(i)=='?' ||s.charAt(i)=='_' ||s.charAt(i)=='\'' ||s.charAt(i)=='/'|| s.charAt(i)==':'
					||s.charAt(i)==',') {
//				System.out.println(s.charAt(i));
				count++;
			}
				
		}
		System.out.println(count);
	}
	
}
