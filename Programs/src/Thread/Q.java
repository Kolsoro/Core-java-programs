package Thread;

public class Q {

	int n;
	boolean value = false;

	public synchronized int get() {
		while (!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got : " + n);
		value = false;
		notify();
		return n;
	}

	public synchronized void put(int n) {
		while (value) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.n=n;
		System.out.println("Put : " + n);
		value = true;
		notify();

	}

}
