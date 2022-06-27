package test1;

import java.util.Scanner;
public class Fibonacci2 {

	static int  n1=0,n2=1,n3;
	
	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.println("type the count of series");
		int count=s.nextInt();
		System.out.print(n1+" "+n2);
		printFib(count-2);
		
	}

	private static void printFib(int count) {
      if(count>0) {
    	  n3=n1+n2;
    	  n1=n2;
    	  n2=n3;
    	  System.out.print(" "+n3);
    	  printFib(count-1);
      }
		
		
	}
	
	

}
