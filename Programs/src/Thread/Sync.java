package Thread;

public class Sync {

	public static void main(String[] args) {

		CallMe callMe = new CallMe();
		Caller c1 = new Caller(callMe, "Hello");
		Caller c2 = new Caller(callMe, "Synchronized");
		Caller c3 = new Caller(callMe, "World");
		c1.t.start();
		c2.t.start();
		c3.t.start();
		
		try {
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}catch(InterruptedException e) {}

		System.out.println();
	}

}
