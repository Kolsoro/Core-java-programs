package test3;

public class Patter2 {
	public static void main(String args[]) {
		char a[][] = new char[7][7];

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j || i + j == 8) {
					if (j <= 4)
						a[i - 1][j - 1] = String.valueOf(Math.min(i, j)).charAt(0);
					else
						a[i - 1][j - 1] = String.valueOf(8-j).charAt(0);

				}
				System.out.print(a[i - 1][j - 1] + " ");
			}
			System.out.println();
		}
	}

}
