package Thread;

public class Thread1 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");
		t1.t.start();
		t2.t.start();
		t3.t.start();
		System.out.println("Is " + t1.name + " is Alive : " + t1.t.isAlive());
		System.out.println("Is " + t2.name + " is Alive : " + t2.t.isAlive());
		System.out.println("Is " + t3.name + " is Alive : " + t3.t.isAlive());

		try {
			System.out.println("Waiting for threads to finish ");
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch (InterruptedException e) {
		}
		System.out.println("Is " + t1.name + " is Alive : " + t1.t.isAlive());
		System.out.println("Is " + t2.name + " is Alive : " + t2.t.isAlive());
		System.out.println("Is " + t3.name + " is Alive : " + t3.t.isAlive());

		System.out.println("exiting main thread !!!");

	}

}
