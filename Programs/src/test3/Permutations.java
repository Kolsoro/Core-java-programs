package test3;
import java.util.Scanner;
public class Permutations {
	
	public static String swap(String s, int i,int j) {
		char[] c=s.toCharArray();
		char ch=c[i];
		c[i]=c[j];
		c[j]=ch;
		return String.valueOf(c);
	}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please type string :");
		String s=sc.nextLine();
		permu(s,0,s.length());
	}
	
	public static void permu(String s,int start,int end) {
	if(start==end-1) {
		System.out.println(s);
	}else {
		for(int i=start;i<end;i++) {
			s=swap(s,start,i);
			permu(s,start+1,end);
			s=swap(s,start,i);
		}

	}
		
	}

}
