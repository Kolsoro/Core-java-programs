package test1;

public class Stronio {

	public static boolean isStronio(int n) {
		if(n/10000==0) {
			String s=Integer.toString(n*2);
			if(s.charAt(s.length()-2)==s.charAt(s.length()-3))
				return true;

		}
		return false;
	}
	
}
