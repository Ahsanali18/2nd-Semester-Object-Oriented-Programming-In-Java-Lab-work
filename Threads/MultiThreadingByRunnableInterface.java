package MultiThreading;

class Demmo implements Runnable{
	public void run() {
		System.out.println("Thread is Running by using Abstraction --> Runnable Interface");
	}
}

public class MultiThreadingByRunnableInterface {
	public static void main(String[] args) {
		//1st way of creating object of Runnable interface and executing the Thread
		Demo d= new Demo();
		Thread th= new Thread(d);
		th.start();
		
		//2nd way of creating object of Runnable interface and executing the Thread
		Thread t1= new Thread(new Demo());
		t1.start();
	}
}
