package test3;

public class MainThread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		MainThread m = new MainThread();
		m.start();
		int i = 1;
		while (i <= 1000) {
			System.out.print(" Hello ");
			i++;
			Thread.currentThread().sleep(10);
		}
	}

	public void run() {
		int i = 1;
		while (i <= 1000) {
			System.out.print(" World");
			i++;
			System.out.println();
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
