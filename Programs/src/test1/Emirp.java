package test1;

public class Emirp {
	
	public static boolean isPrime(int n) {
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEmirp(int n) {
		if(isPrime(n)) {
			int sum=0,temp=n,count=0;
			while(temp>0) {
				temp/=10;
				count++;
			}
			while(n>0) {
				sum=sum*(int)Math.pow(10, count)+n%10;
				n/=10;
				count--;
			}
			if(isPrime(sum))
				return true;
			
		}
		return false;
	}
	
}
