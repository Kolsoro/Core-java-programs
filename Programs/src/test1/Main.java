package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first number :");
//		String x=s.nextLine();
		int n1 = s.nextInt();
//		System.out.println("Please enter the second number :");
//		int n2 = s.nextInt();
//		System.out.println("Please enter the third number :");
//		int n3 = s.nextInt();
// 
		int sum=0;
		for(int i=1;i<=n1;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
