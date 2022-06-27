package test1;

import java.util.ArrayList;
import java.util.List;

public class NPrime {
	
	public static boolean isPrime(int n) {
		if(n>1) {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static int nPrime(int n) {
		int i=1,count=0;
		while(count<n) {
			if(isPrime(i))
				count++;
			i++;
		}
		return --i;
	}
	public static int findNPrime(int n) {
		List<Integer> list=new ArrayList<>();
		int max=100000;
		
		boolean isPrime[]=new boolean[max];
		for(int i=0;i<max;i++) {
			isPrime[i]=true;
		}
		for(int p=2;p*p<max;p++) {
			if(isPrime[p]) {
				for(int i=p*p;i<max;i=i+p) {
					isPrime[i]=false;
				}
			}
		}
		for(int i=1;i<max;i++) {
			if(isPrime(i))
				list.add(i);
		}
		return list.get(n-1);
		
	}

}
