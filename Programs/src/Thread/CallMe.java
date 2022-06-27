package Thread;

public class CallMe {

	public  void  call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("]");
	}
       
		
}
