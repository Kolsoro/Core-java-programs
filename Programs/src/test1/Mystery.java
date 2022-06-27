package test1;

public class Mystery {
	
	public static int revrse(int n) {
		String s=Integer.toString(n);
		String s2="";
		for(int i=0;i<s.length();i++) {
			s2+=s.charAt(s.length()-1-i);
		}
		return Integer.parseInt(s2);
	}
	
	public static int reverse2(int num) {
		int n=0,count=0,temp=num;
		while(num>0) {
			num/=10;
			count++;
		}
		while(temp>0) {
			n+=temp%10*Math.pow(10, count-1);
			count--;
			temp/=10;
		}
		return n;
	}
	
	public static int mystery(int n) {
		for(int i=1;i<=n/2;i++) {
			if(i+revrse(i)==n) {
				return i;
			}
		}
		return 0;
	}

}
