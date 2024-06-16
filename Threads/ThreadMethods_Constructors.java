package MultiThreading;


class Test implements Runnable{
	public void run() {
		System.out.println("Thread-1"+Thread.currentThread().getName());
		
	}
}

public class ThreadMethods_Constructors {
	public static void main(String[] args) {
//		Thread t= new Thread(new Test());
//		t.start();
		Test t1= new Test();
		Thread t= new Thread(t1);
		t.start();
		
	}

}
