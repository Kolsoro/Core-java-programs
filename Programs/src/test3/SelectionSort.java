package test3;

public class SelectionSort {
	public static void main(String[] args) {

		int []a= {9,8,7,6,5,4,3,2,1};

		int n=a.length;
		
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

}}
