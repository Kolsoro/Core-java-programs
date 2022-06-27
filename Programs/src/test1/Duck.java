package test1;

public class Duck {
	
	public static boolean duck(String n) {
		
		if(n.charAt(0)!='0') {
			for(int i=1;i<n.length();i++) {
				if(n.charAt(i)=='0')
					return true;
			}
		}
		return false;
	}

}
