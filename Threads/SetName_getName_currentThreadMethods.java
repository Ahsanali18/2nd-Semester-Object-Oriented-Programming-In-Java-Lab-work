package MultiThreading;


class NamingMethods extends Thread{
	public void run() /*Overriding run method of Thread class */{
		
		System.out.println("Thread Task: "+Thread.currentThread().getName()); 
	}
}

public class SetName_getName_currentThreadMethods {
	public static void main(String[] args) {
		System.out.println("-------------- Naming Methods of Thread class ---------------\n");
		String nameOfMainThread=Thread.currentThread().getName();
		System.out.println("Displaying Name of Main Thread by using .getName() method:"+nameOfMainThread);
		
		Thread.currentThread().setName("My Main"); // Here we give our own name to the main method
		System.out.println("Changing Name of Main Thread by using .setName() method: "+Thread.currentThread().getName());
		
		NamingMethods t1= new NamingMethods();
		t1.setName("T1 is executing ");
		t1.start();
		
		NamingMethods t2= new NamingMethods();
		t2.setName("T2 is executing");
		t2.start();	
	}
}	
