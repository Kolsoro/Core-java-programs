package Thread;

public class MyThread implements Runnable {

	Thread t;
	String name;
	

	MyThread(String name) {
		this.name = name;
		t = new Thread(this, name);
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("Thread "+name +"is exiting ");
	}

}
