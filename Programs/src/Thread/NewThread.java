package Thread;

public class NewThread implements Runnable {

	String name;
	Thread t;
	boolean suspendThread;
	NewThread(String name){
		this.name=name;
		t=new Thread(this,name);
		System.out.println("New Thread : "+t);
		suspendThread=false;
	}
	public void run() {
		try {
			for(int i=15;i>0;i--) {
				System.out.println(name+" : "+i);
				Thread.sleep(200);
				synchronized(this) {
					while(suspendThread) {
						wait();
					}
				}
			}
		}catch(InterruptedException e) {}
	}
	public synchronized void mySuspend() {
		suspendThread=true;
	}
	public synchronized void myResume() {
		suspendThread=false;
		notify();
	}
	public static void main(String args[]) {
		NewThread obj1=new NewThread("One");
		NewThread obj2=new NewThread("Two");
		obj1.t.start();
		obj2.t.start();
		
		try {
			Thread.sleep(200);
			obj1.mySuspend();
			System.out.println("suspending thread One");
			Thread.sleep(200);
			obj1.myResume();
			System.out.println("Resuming thread one");
			Thread.sleep(200);
			obj2.mySuspend();
			System.out.println("suspending thread two");
			Thread.sleep(200);
			obj2.myResume();
			System.out.println("Resuming thread two");
	
			System.out.println("waiting for threads to finish ");
			obj1.t.join();
			obj2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("exiting main thread");
		
		
	}
}
