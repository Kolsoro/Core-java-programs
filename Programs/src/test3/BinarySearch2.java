package test3;

import java.util.Arrays;

public class BinarySearch2 {
	
	public static int binary(int []a,int first,int last,int key) {
		if(first>last)
			return -1;
		else {
			int mid=(first+last)/2;
			if(key<a[mid])
				return binary(a,first,mid-1,key);
			else if(key>a[mid])
				return binary(a,mid+1,last,key);
			else
				return mid;
		}
		
	}
	
	public static void main(String args[]) {
		int a[] = { 10, 20, 19, 30, 40, 50, 60, 90, 70, 85, 100 };
		Arrays.sort(a);
		int i=binary(a,0,a.length-1,119);
		if(i!=-1)
			System.out.println("key found at : "+i);
		else
			System.out.println("key not present here ");
		


	}}
