package test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NSmallest {

	public static int smallest(int a[]) {
		int min = a[0];
		for (int i : a) {
			if (i < min)
				min = i;
		}
		return min;

	}

	public static int nSmallest(int n, int a[]) {

		int min = 0;
		while (n > 0) {
			min = smallest(a);
			for (int i = 0; i < a.length; i++) {
				if (a[i] == min)
					a[i] = Integer.MAX_VALUE;
			}
			n--;
		}
		return min;

	}
	
	public static int nSmallest2(int n,int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[n-1];
	}
	
	public static int nSmallest3(int n,int a[]) {
		Arrays.sort(a);
		return a[n-1];
	}
	
	public static int nSmallest4(int n,Integer a[]) {
		List<Integer> l=Arrays.asList(a);
		Collections.sort(l);
		return l.get(n-1);
	}

}
