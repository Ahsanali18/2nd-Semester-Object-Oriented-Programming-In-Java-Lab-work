package MultiThreading;

class SleepMethod1 extends Thread{
	public void run()  /*throws InterruptedException --> we can't use this with run() method */ {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000); //single argumented sleep(long millis) --> exactly stops for 1,2,3,4,...seconds.
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i+": "+Thread.currentThread().getName());
		}
	}
}

public class SleepMethod_1_UsingThread {
	public static void main(String[] args) {
		SleepMethod1 t1= new SleepMethod1();
		t1.start();
		
		SleepMethod1 t2= new SleepMethod1();
		t2.start();
	}
}