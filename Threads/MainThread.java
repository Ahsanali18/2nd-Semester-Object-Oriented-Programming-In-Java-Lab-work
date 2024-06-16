package MultiThreading;

class CreateThread extends Thread{
	public void run() {
		System.out.println("Thread created"+Thread.currentThread().getName());
	}
}

public class MainThread {

	public static void main(String[] args) {
		CreateThread ct= new CreateThread();
		ct.start();
		System.out.println(Thread.currentThread().getName());
	}
}
