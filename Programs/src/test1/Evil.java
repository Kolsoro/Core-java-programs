package test1;

public class Evil {
	
	public static int binary(int n) {
		int sum=0,count=0;
		while(n>0) {
			sum+=(n%2)*Math.pow(10, count);
			n/=2;
			count++;
		}
		return sum;
	}
	
	public static boolean evil(int n) {
		int bin=binary(n);
		int count=0;
		while(bin>0) {
			if(bin%10==1)
				count++;
			bin/=10;
		}
		if(count%2==0)
			return true;
		return false;
		
	}

}
