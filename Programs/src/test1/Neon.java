package test1;

public class Neon {
	
	public static boolean neon(int n) {
		int sq=n*n,sum=0;
		while(sq>0) {
			sum+=sq%10;
			sq/=10;
		}
		return sum==n;
	}

}
