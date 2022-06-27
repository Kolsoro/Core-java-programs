package test1;

public class Reverse {
	
	public static int reverse(int n) {
		boolean flag=n<0?true:false;
		if(flag) {
			n*=-1;
		}
		int temp=n,rev=0;
		
		while(temp>0) {
			rev=rev*10+temp%10;
			temp/=10;
		}
		return flag?rev*-1:rev;
	}

}
