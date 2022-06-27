package test2;

public class LowerTraingle {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int m3[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j >= i)
					m3[i][j] = m1[i][j];
				else
					m3[i][j]=0;
				System.out.print(m3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
