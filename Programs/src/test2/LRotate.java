package test2;

public class LRotate {

	public static int[] lRotate(int n, int[] a) {
		while (n > 0) {
            int first=a[0];
			for (int i = 0; i < a.length - 1; i++) {

				a[i]=a[i+1];
			}
             a[a.length-1]=first;
             n--;
		}
		return a;
	}
}
