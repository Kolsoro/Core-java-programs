package test1;

public class Bouncy {

	public static boolean increasing(int n) {
		int last_read = 0;
		while (n > 0) {
			if (last_read == 0 ) {
				if(n%10==0)
					return false;
				last_read = n % 10;
				n /= 10;
			} else {
				if (last_read < n % 10)
					return false;
				last_read = n % 10;
				n /= 10;

			}
		}
		return true;
	}
	
	public static boolean decreasing(int n) {
		int last_read=0;
		while(n>0) {
			if(last_read==0 && n%10>=0) {
				last_read=n%10;
				n/=10;
			}else if(n%10<last_read) 
				return false;
			else {
				last_read=n%10;
				n/=10;
			}
		}
		return true;
	}
	
	public static boolean bouncy(int n) {
		if(!decreasing(n) && !increasing(n)) {
			return true;
		}
		return false;
	}

}
