package test1;

public class Largest {
	
	public static int largest(int a,int b,int c) {
		
		return a>b?(a>c?a:c):(b>c?b:c);
			
	}
	
	public static int smallest(int a,int b,int c) {
		return a<b?(a>c?c:a):(b>c?c:b);
	}

}
