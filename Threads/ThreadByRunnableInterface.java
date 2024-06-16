package SirNaveen;

class CreateThreadByInterface implements Runnable{
	public void run() {
		System.out.println("Thread is created using Runnable Interface");
	}
}

public class ThreadByRunnableInterface {

	public static void main(String[] args) {
		CreateThreadByInterface t= new CreateThreadByInterface();
		Thread t1= new Thread(t); // This is method to pass the object to Thread class if interface method used.
		t1.start();
		
		Thread t2= new Thread(new CreateThreadByInterface());  // Method-2 to create object of if Runnable is used.
		t2.start();
	}

}
