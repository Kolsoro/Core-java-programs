package test3;

public class InsertionSort {
	
	public static void main(String[] args) {

		int []a= {9,8,7,6,5,4,3,2,1};

		int n=a.length;

		for(int i=1;i<n;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			for(int k=0;k<n;k++) {
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}

	}}
