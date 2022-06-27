package test2;

public class Reverse {

	public static int[] reverse(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[a.length - 1 - i] = a[i];
		}
		return b;
	}

}
