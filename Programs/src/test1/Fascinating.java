package test1;

public class Fascinating {

	public static boolean isFas(int n) {
		int count=0,temp=n;
		while(temp>0) {
			temp/=10;
			count++;
		}
		if(count>=3) {
			String n0 =Integer.toString(n);
			String n1=Integer.toString(n*2);
			String n2=Integer.toString(n*3);
			String sum=n0+n1+n2;
			
			for(int i=1;i<=9;i++) {
				int times=0;
				for(int j=0;j<sum.length();j++) {
					if(sum.charAt(j)==Integer.toString(i).charAt(0)) {
						times++;
					}
				}
				if(times!=1) {
					return false;
				}
			}
			return true;
			
		}else {
			return false;
		}
	}
	
}
