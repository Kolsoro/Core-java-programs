package test1;

public class Spy {
	
	public static boolean spy(int n) {
		int pro=1,sum=0;
		while(n>0) {
			pro*=n%10;
			sum+=n%10;
			n/=10;
		}
		return pro==sum;
	}

}
