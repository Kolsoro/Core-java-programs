package test1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.println("type the number to check ");
		int n=s.nextInt();
		int m=n/2;
		boolean flag=true;
		for(int i=2;i<m;i++) {
			if(n%i==0) {
				System.out.println("the number is not a prime number");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("The number is a prime number");
		
		
	}

}
