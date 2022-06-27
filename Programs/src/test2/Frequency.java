package test2;

public class Frequency {

	public static int[] fr(int a[]) {
		int f[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++)
				if (a[i] == a[j])
					count++;
			f[i] = count;
		}
		return f;
	}

	public static int[] freq(int a[]) {
		int visited = -1;

		int f[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (f[i] != visited) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						f[j] = visited;
					}
				}
				f[i] = count;
			}
		}
		return f;

	}

}
