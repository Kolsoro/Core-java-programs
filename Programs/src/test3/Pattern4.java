package test3;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("Type lines");
		int n=s.nextInt();

		for(int i=0;i<n;i++) {
			for(int j=0;j<2*i+1;j++) {
				if(i==j)
					System.out.print(0);
				else if(i>j)
					System.out.print(10-i+j);
				else if(i<j)
					System.out.print(10-j+i);
			}
			System.out.println();

		}
	
	
}
}