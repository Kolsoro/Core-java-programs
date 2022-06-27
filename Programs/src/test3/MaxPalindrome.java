package test3;
import java.util.Scanner;
public class MaxPalindrome {
	
	public static boolean isPalindrome(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			r+=s.charAt(s.length()-1-i);
		}
		if(s.equals(r))
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int max=0;
		String p="";
		String s =sc.nextLine();
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(isPalindrome(sub)) {
					if(sub.length()>max) {
						max=sub.length();
						p=sub;
					}
				}
			}
		}
		System.out.println("the maximum length palindrome possible is :"+p);
		
		
	}

}
