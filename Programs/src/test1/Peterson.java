package test1;

public class Peterson {
	
	public static boolean isPeterson(int num) {
		int temp=num,sum=0;
		while(temp>0) {
			int last=temp%10;
			int fact=1;
			while(last>0) {
				fact*=last;
				last--;
			}
			sum+=fact;
			temp/=10;
		}

		if(sum==num) {
			return true;
		}return false;
	}

	
}
