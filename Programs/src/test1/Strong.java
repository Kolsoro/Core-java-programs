package test1;

public class Strong {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
		
	}
	public static boolean isStrong(int n) {
		int sum=0,temp=n;
		while(n>0) {
			sum+=fact(n%10);
			n/=10;
		}
		if(temp==sum)
			return true;
		return false;
	}

}
