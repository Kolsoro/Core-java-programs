package test2;

public class SumRowAndColumnMatrix {
	public static void main(String args[]) {
		int[][] m1 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int r = m1.length;
		int c = m1[0].length;
		int rows[] = new int[r];
		int cols[] = new int[c];
		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum += m1[i][j];
			}
			rows[i] = sum;
		}

		for (int i = 0; i < c; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum += m1[j][i];
			}
			cols[i] = sum;
		}
		System.out.println("rows sums:");
		for (int i : rows)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("columns sums:");
		for (int i : cols)
			System.out.print(i + " ");

	}
}
