package MultiThreading;

class CreateDaemon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon())
			System.out.println("Thread becomes Daemon thread!");
		else
			System.out.println("Child Thread");
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		System.out.println("This is main"); // If this is commented then no output will be there b/c
											// daemon thread runs in the background of the current thread
											// that's why if here main doesn't do anything so daemon also
		
//		Thread.currentThread().setDaemon(true); // Throws an Exception b/c main method first starts 
											    //  then how can it becomes daemon. 	
		CreateDaemon daemon= new CreateDaemon();
		daemon.setDaemon(true);
		daemon.start();
		
		System.out.println(daemon.isDaemon());
	}
}
