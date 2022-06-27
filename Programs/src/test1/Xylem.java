package test1;

public class Xylem {
	
	public static boolean isXylem(int n) {
		String s=Integer.toString(n);
		int sum=0;
		for(int i=1;i<s.length()-1;i++) {
			sum+=Integer.parseInt(Character.toString(s.charAt(i)));
					}
		if(sum==Integer.parseInt(Character.toString(s.charAt(0)))
				+Integer.parseInt(Character.toString(s.charAt(s.length()-1)))) {
			return true;
		}
		return false;
}
}