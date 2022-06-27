package test1;

public class Tech {

	public static boolean isTech(int n) {
		int temp=n,count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		if(count%2==0) {
			int last=n%(int)Math.pow(10, count/2);
			int first=n/(int)Math.pow(10, count/2);
			int sum=first+last;
			if(sum*sum==n) {
				return true;
			}
		}
		return false;
	}
}
