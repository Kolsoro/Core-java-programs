package test2;

public class Identity {

	public static void main(String[] args) {

		int a[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int r=a.length;
		int c=a[0].length;
		boolean flag=true;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j && a[i][j]!=1)
					flag=false;
				else if(i!=j && a[i][j]!=0)
					flag=false;
					
			}
		}
		System.out.println(flag?"Yes ":"No");
		

	}

}
