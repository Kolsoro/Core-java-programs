package test1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		int balance=100000,withdraw,deposit;
		System.out.println("Welcome to samer ATM");
		System.out.println("Please  enetr 1 to withdraw");
		System.out.println("Please enter 2 to deposit");
		System.out.println("Please enetr 3 to check balance");
		System.out.println("Please enter 4 to exit");
		System.out.println("Please choose one of above option :");
		
		int n=s.nextInt();
		switch(n) {
		case 1 :
			System.out.println("Please enter money to withdraw");
			withdraw=s.nextInt();
			if(withdraw<balance) {
				balance-=withdraw;
				System.out.println("Please collect your money");
			}else {
				System.out.println("Insufficient balance");
			}
			System.out.println();
			break;
		case 2:
			System.out.println("Please enetr amount to be deposited");
			deposit=s.nextInt();
			balance+=deposit;
			System.out.println("Amount deposited successfully");
			System.out.println();
			break;
		case 3:
			System.out.println("Balance : "+balance);
			break;
		case 4:
			System.exit(0);
			
		}
		
		
	}

}
