package test3;

public class LinearSearch {
	
	public static int linear(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int a[]= {10,20,20,30,40,50,60,90,70,80,100};
		int i=linear(a, 50);
		if(i!=-1)
			System.out.println("element found at index : "+i);
		else
			System.out.println("element not present here ");
		
		
	}
	

}
