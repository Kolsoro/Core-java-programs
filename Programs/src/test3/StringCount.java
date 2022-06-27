package test3;

import java.util.Scanner;
public class StringCount {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
		
	}

}
