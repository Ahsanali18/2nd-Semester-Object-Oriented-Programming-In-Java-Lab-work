package MultiThreading;

class SleepMethod2 extends Thread{
	public void run() {
		for(int i=1; i<=10; i+=1) {
			try {
				Thread.sleep(1000,5000); //double argumented sleep(long millis, int nano) --> don't exactly stops 
															// --> for 1,2,3,4,... seconds but also 1+(nano seconds).
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i+": "+Thread.currentThread().getName());
		}
	}
}

public class SleepMethod_2_UsingThread {
	public static void main(String[] args) {
		SleepMethod2 t1= new SleepMethod2();
		t1.start();
		
		SleepMethod2 t2= new SleepMethod2();
		t2.start();
	}
}
