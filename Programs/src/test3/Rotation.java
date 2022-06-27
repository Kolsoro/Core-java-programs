package test3;

import java.util.Scanner;

public class Rotation {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();
        System.out.println("enter rotated string ");
        String r=sc.nextLine();
        s+=s;
        if(s.indexOf(r)!=-1)
        	System.out.println("Yes");
        else
        	System.out.println("No");
		
	}
}
