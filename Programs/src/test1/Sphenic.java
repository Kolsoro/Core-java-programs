package test1;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Sphenic {
	
	public static boolean isPrime(int n) {
		if(n>1) {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0)
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static boolean isSphenic(int n) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				list.add(i);
		}
		int pro=1,count=0;
//		Iterator<Integer> i=list.iterator();
//		while(i.hasNext()) {
//			if(isPrime(i.next())) {
//				pro*=i.next();
//				count++;
//			}				
//		}
		for(int i=0;i<list.size();i++) {
			if(isPrime(list.get(i))) {
				pro*=list.get(i);
				count++;
			}
		}
		if(count==3 && pro==n) {
			return true;
		}
		return false;
	}
	
	

}
