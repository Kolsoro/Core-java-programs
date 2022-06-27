package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keith {

	
	public static boolean keith(int num) {
		int d=0,temp=num;
		while(temp>0) {
			temp/=10;
			d++;
		}
		temp=num;
		List<Integer> list=new ArrayList<>();
		while(temp>0) {
			list.add(temp%10);
			temp/=10;
		}
		Collections.reverse(list);
		int i=d-1;
		while(list.get(i)<num) {
			int sum=0;
			for(int j=i;j>=i-d+1;j--) {
				sum+=list.get(j);
			}
			list.add(sum);
			i++;
		}
		return list.get(i)==num;
	}
}
