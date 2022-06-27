package test3;

import java.util.Scanner;

public class SpiralPattern2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int n = s.nextInt();
		spiral(n);
	}

	public static void spiral(int n) {
		int a[][] = new int[2 * n - 1][2 * n - 1];
		int start = 0;
		int end = 2 * n - 2;
		while (start <= end) {
			for (int i = start; i <= end; i++) {
				a[start][i] = n;
			}

			for (int i = start + 1; i <= end; i++) {
				a[i][end] = n;
			}

			for (int i = end - 1; i >= start; i--) {
				a[end][i] = n;
			}

			for (int i = end - 1; i > start; i--) {
				a[i][start] = n;
			}

			start++;
			end--;
			n--;

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				if (a[i][j] < 10)
					System.out.print(" " + a[i][j] + " ");
				else
					System.out.print(a[i][j] + " ");
			System.out.println();

		}
	}
}