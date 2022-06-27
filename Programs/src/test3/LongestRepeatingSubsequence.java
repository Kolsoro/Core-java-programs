package test3;
import java.util.Scanner;
public class LongestRepeatingSubsequence {
	
	public static String lcp(String s,String t) {
		int n=Math.min(s.length(), t.length());
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=t.charAt(i))
				return s.substring(0,i);
		}
		return s.substring(0, n);
		
	}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the string :");
		String s=sc.nextLine();
		int n=s.length();
		String lrs="";
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				String x=lcp(s.substring(i,n),s.substring(j,n));
				if(lrs.length()<x.length())
					lrs=x;
			}
		}
		System.out.println(lrs);
		
	}

}
