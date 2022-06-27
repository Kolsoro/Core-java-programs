package test2;

public class MultiMax {
	public static void main(String args[]) {
		int[][] m1 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int[][] m2 = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		int r1,c1,r2,c2;
		r1=m1.length;
		r2=m2.length;
		c1=m1[0].length;
		c2=m2[0].length;
		if(r2!=c1)
			System.out.println("Matrix can not be multiplied");
		else {
			int m3[][] = new int[r1][c2];

			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					m3[i][j]=0;
					for(int k=0;k<c1;k++) {
						m3[i][j]+=m1[i][k]*m2[k][j];
					}
					System.out.print(m3[i][j]+" ");
				}
				System.out.println();
			}
				
			
			
			
			
			
		}
			}
}
