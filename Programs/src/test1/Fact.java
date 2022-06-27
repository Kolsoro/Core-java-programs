package test1;

public class Fact {
	
	int f=1;
	
	
	public int calcFact(int num) {
		for(int i=1;i<=num;i++) {
			f*=i;
		}
		return f;
	}

}
