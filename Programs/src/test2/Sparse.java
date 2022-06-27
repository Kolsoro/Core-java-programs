package test2;

public class Sparse {
	public static void main(String args[]) {
		int[][] a= {{0,2,0},{0,8,0},{0,0,4}};
		int r=a.length;
		int c=a[0].length;
		int count=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==0)
					count++;
			}
		}
		System.out.println(count>r*c/2?"Yes":"No");			
		
		
		
	}
	

}
