package test1;

public class Fibonacci1 {

	public static void main(String args[]) {
		Long n1=1l,n2=2l,n3,count=100l;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<count;i++) {
			n3=n1*n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	
}
