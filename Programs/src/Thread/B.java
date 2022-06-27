package Thread;

public class B {

	public synchronized void bar(A a) {
		String name=Thread.currentThread().getName();
		System.out.println(name+" inside B.bar()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" calling A.last()");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B.last()");
	}
}
