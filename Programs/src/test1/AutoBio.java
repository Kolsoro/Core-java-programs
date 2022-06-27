package test1;

public class AutoBio {
	
	public static boolean bio(int n) {
		int temp=n,count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		int d[]=new int[count];
		for(int i=count-1;i>=0;i--) {
			d[i]=n%10;
			n/=10;
		}
		for(int i=0;i<count;i++) {
			int times=0;
			for(int j=0;j<count;j++) {
				if(i==d[j]) {
					times++;
				}
			}
			if(d[i]!=times)
				return false;
		}
		return true;
	}

}
