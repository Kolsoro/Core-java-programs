package test3;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type lines");
		int n = s.nextInt();
		int val=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=2*n-1;j++) {
			if(j>=n-i+1 && j<=n+i-1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	}
}