package test3;

import java.util.Scanner;

public class ArrayPattern {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int n = s.nextInt();
		spiral(n);
	}

	public static void spiral(int n) {
		int start = 0;
		int end = n - 1;
		int val = 1;
		int a[][] = new int[n][n];
		while (start <= end) {
			for (int i = start; i <= end; i++) {
				a[start][i] = val;
				val++;
			}

			for (int i = start + 1; i <= end; i++) {
				a[i][end] = val;
				val++;
			}

			for (int i = end - 1; i >= start; i--) {
				a[end][i] = val;
				val++;
			}

			for (int i = end - 1; i > start; i--) {
				a[i][start] = val;
				val++;
			}

			start++;
			end--;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if(a[i][j]<10)
					System.out.print(" "+a[i][j]+" ");
				else
					System.out.print(a[i][j]+" ");
			System.out.println();
		}

	}

}
