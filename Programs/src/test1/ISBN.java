package test1;

public class ISBN {
	
	public static boolean isIsbn(long n) {
		long sum=0,count=1;
		while(n>0) {
			sum+=(n%10)*count;
			count++;
			n/=10;
		}
		if(sum%11==0)
			return true;
		return false;
	}

}
