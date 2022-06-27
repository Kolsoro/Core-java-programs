package test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.List;
import java.util.ArrayList;

import test1.A;

public class NLargest {
	public static int largest(int[] a) {
		int max = 0;
		for (int i : a)
			if (max < i)
				max = i;
		return max;

	}
	
	public static int nLargest2(int n,int a[]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[a.length-n];
		
	}
	public static int nLargest3(int n,Integer a[]) {
		
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);
		return list.get(a.length-n);
	}
	
	
	public static  int nLargest(int n,int a[]) {
		int max=0;
		while(n>0) {
			max=largest(a);
			for(int i=0;i<a.length;i++) {
				if(max==a[i])
					a[i]=0;
			}
			n--;
		}
		return max;
		
	}

}
