package test2;
import java.util.Arrays;
public class RemoveDuplicate {
	
	public static int singleCount(int a[]) {
		int c=1;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])
				c++;
		}
		return c;
	}

	public static int[] removeDuplicate(int a[]) {
		Arrays.sort(a);
		int j=singleCount(a),c=1;
		int temp[]=new int[j];
		temp[0]=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				temp[c]=a[i];
				c++;
			}
		}
		return temp;
		
	}
}
