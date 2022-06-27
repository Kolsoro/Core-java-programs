package test3;

import java.util.Scanner;

public  class Duplicate {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();
		int f[]=new int[s.length()];
		int v=-1;
		for(int i=0;i<s.length();i++) {
			if(f[i]!=v) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						f[i]+=1;
						f[j]=v;
					}
				}
			}
		}
		for(int i=0;i<f.length;i++) {
			if(f[i]!=v) {
				System.out.println(s.charAt(i)+" : "+(f[i]+1));
			}
		}
		
}
}