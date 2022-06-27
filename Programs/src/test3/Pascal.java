package test3;

import java.util.Scanner;

public class Pascal {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type lines");
		int n = s.nextInt();
		int a[][]=new int[n][2*n-1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j==n-i+1 || j==n+i-1)
					a[i-1][j-1]=1;
				else if(j>n-i+1 && j<n+i-1)
					a[i-1][j-1]=(a[i-2][j-2]+a[i-2][j]);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				if(a[i][j]==0)
					System.out.print(" ");
				else
					System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		

	}
}