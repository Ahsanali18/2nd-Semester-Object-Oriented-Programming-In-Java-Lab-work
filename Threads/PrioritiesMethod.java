package MultiThreading;

class SetPriority extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread: "+Thread.currentThread().getName()+", Priority: "+Thread.currentThread().getPriority()
							  +", Value: "+i);
			}
	}
}
public class PrioritiesMethod {
	public static void main(String[] args) {
		
		System.out.println("Main Thread, Default Priority is: "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main Thread, Max Priority is: "+Thread.currentThread().getPriority()+"\n");
		
		SetPriority t1=new SetPriority();
//		t1.setPriority(1); // we can also set MIN priority by using constant (MIX_PRIORITY)
		t1.setPriority(Thread.MIN_PRIORITY); // set's priority by 10
		t1.start();
		
		SetPriority t2= new SetPriority();
//		t2.setPriority(10); // we can also set MAX priority by using constant (MAN-PRIORITY)
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}
}
