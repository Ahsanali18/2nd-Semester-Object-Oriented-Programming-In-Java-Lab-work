package MultiThreading;

class Demo extends Thread{
	public void run() {
		System.out.println("Thread is Running");
	}
}
public class MultiThreadingByThreadClass {
	public static void main(String[] args) {
		Demo d= new Demo();
		d.start();
	}
}
