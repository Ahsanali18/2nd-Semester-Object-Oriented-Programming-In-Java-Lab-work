package MultiThreading;

class Yield extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread: "+Thread.currentThread().getName()+" : "+i);
			Thread.yield();  // This stops the execution of current thread and first main thread completes it's 
							//  execution then this thread will be executed (This whole depends on Thread Scheduling).
		}
	}
}
public class YieldMethod {
	public static void main(String[] args) {
		Yield t1= new Yield();
		t1.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main Thread: "+Thread.currentThread().getName()+" : "+i);
		}
	}
}
