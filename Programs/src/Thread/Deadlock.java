package Thread;

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();
	Thread t;

	public Deadlock() {
		Thread.currentThread().setName("Main thread");
		t = new Thread(this, "Racing thread");
	}

	public void startDeadlock() {
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}

	public void run() {

		b.bar(a);
		System.out.println("Back in racing thread");
	}
	
	public static void main(String args[]) {
		Deadlock d =new Deadlock();
		d.startDeadlock();
	}

}
