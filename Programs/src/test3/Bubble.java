package test3;

public class Bubble {
	
	public static void main(String[] args) {

		int []a= {9,8,7,6,5,4,3,2,1};

		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				for(int k=0;k<a.length;k++)
					System.out.print(a[k]+" ");
				System.out.println();
			}
		}
}}
