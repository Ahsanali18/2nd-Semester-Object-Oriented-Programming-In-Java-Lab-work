package SirNaveen;

class Demo extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i+" Running"+Thread.currentThread().getName());
		}
	}
}

public class ThreadClassMethods {

	public static void main(String[] args) {
		Demo t1= new Demo();
		t1.setName("Thread-1");
		Demo t2= new Demo();
		t2.setName("Thread-2");
	
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
	
		t1.start();
		try {
			t1.sleep(1000);
			t2.start();
//			t2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
