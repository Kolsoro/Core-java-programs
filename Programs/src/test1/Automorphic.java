package test1;

public class Automorphic {
	
	public static boolean auto(int num) {
	int sq=num*num;
	int count =0,temp=num;
	while(temp>0) {
		count++;
		temp/=10;
	}
	if(num==sq%Math.pow(10, count)) {
		return true;
	}
	return false;
	}
	

}
