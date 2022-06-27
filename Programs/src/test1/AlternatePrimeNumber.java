package test1;

import java.util.ArrayList;
import java.util.List;

public class AlternatePrimeNumber {

	public static List<Integer> nPrimes(int n){
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<=n;i++) {
			if(isPrime(i))
				list.add(i);
		}
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<list.size();i=i+2) {
			list2.add(list.get(i));
		}

		return list2;
		
	}
	
	public static boolean isPrime(int n) {
		if(n>1) {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;

		}
			return false;	
	}
	
}
