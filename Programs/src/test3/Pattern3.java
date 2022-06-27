package test3;

import java.util.Scanner;

public class Pattern3 {
	
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("Type lines");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n;j++) {
				if(j<n-i || j>=n+i)
					System.out.print(Math.min(j+1,2*n-j));
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
