package test2;
import java.util.List;
import java.util.ArrayList;
public class duplicate {

	public static List<Integer> dup(int[] a){
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && !l.contains(a[i])) {
					l.add(a[i]);
				}
			}
		}
		return l;
		
	}
	
}
