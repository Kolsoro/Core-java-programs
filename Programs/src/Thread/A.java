package Thread;

public class A {

	
	public synchronized void foo(B b) {
		String name=Thread.currentThread().getName();
		System.out.println(name+" enetred A.foo()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"trying to call B.last()");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A.last()");
	}
	
}
