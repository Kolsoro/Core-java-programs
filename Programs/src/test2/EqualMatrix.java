package test2;

public class EqualMatrix {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int[][] m2 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		boolean flag = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					flag = false;
			}
		}
		System.out.println(flag ? "Equal" : "Not Equal");
	}

}
