package test1;

public class SquareRoot {
	
	public static int squareRoot(int n) {
		int temp=0;
		int sr=n/2;
		do {
			temp=sr;
			sr=(temp+(n/temp))/2;
		}while((temp-sr)!=0);
		return sr;
	}

	public static double sqr(int n) {
		for(int i=1;i<n/2;i++) {
			if(i*i==n)
				return i;
		}
		int i=1;
		while(i*i<n) {
			i++;
		}
		for(double j=i-1;j<=i;j=j+0.01) {
			if(j*j>n) {
				return j;
			}
		}
		return 0;
	}
}
