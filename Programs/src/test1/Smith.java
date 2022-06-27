package test1;

import java.util.List;
import java.util.ArrayList;

public class Smith {

	public static boolean isPrime(int n) {
		if(n==1||n==0)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static List<Integer> factors(int n){
		
		List<Integer> list=new ArrayList<>();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0 && isPrime(i))
				list.add(i);
		}
		return list;
	}
	public static  int sum(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static boolean isSmith(int n) {
		List<Integer> list=factors(n);
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=sum(list.get(i));
		}
		if(sum==sum(n))
			return true;
		return false;
	}
	
	
}
