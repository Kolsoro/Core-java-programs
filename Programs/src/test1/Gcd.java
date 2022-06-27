package test1;

public class Gcd {

	public static boolean isPrime(int n) {
		if (n > 1) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;

			}
			return true;
		}
		return false;
	}

	public static int lcm(int n1, int n2) {

		for (int i = 1; i <= n1 * n2; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				return i;
			}
		}
		return 0;
	}

	public static int gcd(int n1, int n2) {
		int s = n1 > n2 ? n1 : n2, h = 1;
		for (int i = 1; i <= s / 2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				h = i;
		}
		return h;
	}

	public static int gcd2(int n1, int n2) {
		while (n1 != n2) {
			if (n1 > n2)
				n1 -= n2;
			else
				n2 -= n1;
		}
		return n1;
	}

	public static int gcd3(int n1,int n2) {
		int temp;
		while(n2!=0) {
			temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		return n1;
	}
	
	public static int gcd4(int a ,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a>b)
			return gcd4(a-b,b);
		return gcd4(a,b-a);
	}
	
}
