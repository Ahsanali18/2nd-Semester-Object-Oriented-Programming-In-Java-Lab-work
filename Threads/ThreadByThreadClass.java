package SirNaveen;
//							Creating Thread using Thread Class Method(01)
class CreateThread extends Thread{
	
	public void run() {
		System.out.println("Thread is created!");
	}
}
public class ThreadByThreadClass {
	public static void main(String[] args) {
		CreateThread ct= new CreateThread();
		ct.start();
	}
}
