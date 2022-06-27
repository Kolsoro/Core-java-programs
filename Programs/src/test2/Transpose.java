package test2;

public class Transpose {

	public static void main(String args[]) {
		int[][] a = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int r = a.length;
		int c = a[0].length;
		int b[][] = new int[c][r];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b[j][i] = a[i][j];
			}
		}
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}
}
