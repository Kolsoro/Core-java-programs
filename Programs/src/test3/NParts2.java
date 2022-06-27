package test3;

import java.util.Scanner;

public class NParts2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string :");
		String s = sc.nextLine();
		System.out.println("enter no of parts to divide in :");
		int n = sc.nextInt();
		String[] temp = new String[n];
		if (s.length() % n != 0)
			System.out.println("string can not be divided into equal parts ");
		else {
			int subLength = s.length() / n;
			for (int i = 0; i < s.length(); i = i + subLength) {
				temp[temp.length - n] = s.substring(i, i + subLength);
				n--;
			}
			System.out.println("The strigsn are: ");
			for (String i : temp)
				System.out.print(i + " ");
		}

	}

}
