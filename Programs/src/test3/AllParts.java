package test3;
import java.util.Scanner;

public class AllParts {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string :");
		String s=sc.nextLine();
		int n=s.length();
		int c=1;
		String a[]=new String[n*(n+1)/2];
		int k=0;
		while(c<=n) {
			
			for(int i=0;i+c<=s.length();i++) {
				a[k]=s.substring(i, i+c);
				k++;
			}
			c++;
		}
		for(String i:a) {
			
			System.out.print(i+"  ");
		}
		
		
	}
		
	
	
}
