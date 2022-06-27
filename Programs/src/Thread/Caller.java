package Thread;

public class Caller implements Runnable{

	public CallMe callMe;
	public String msg;
	Thread t;
	Caller(CallMe callMe,String msg){
		this.callMe=callMe;
		this.msg=msg;
		t=new Thread(this);
	}
	public void run() {
		synchronized (callMe) {
			callMe.call(msg);
		}
	}
	
}
