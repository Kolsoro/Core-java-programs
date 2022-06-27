package test1;

public class Swap {
	
	public static int binary(int n) {
		int b=0,count=0;
		while(n>0) {
			b+=n%2*Math.pow(10, count);
			count++;
			n/=2;
		}
		return b;
	}
	
	public static int[] swap(int n1,int n2) {
		int b1=binary(n1);
		int b2=binary(n2);
		b1=b1^b2;
		b2=b1^b2;
		b1=b1^b2;
		return new int[] {number(b1),number(b2)};
	}
	
	public static int number(int b) {
		int n=0,count=0;
		while(b>0) {
			n+=b%10*Math.pow(2, count);
			b/=10;
			count++;
		}
		return n;
		
	}
	
	public static String multSwap(int n1,int n2) {
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		return n1+" "+n2;
	}

}
