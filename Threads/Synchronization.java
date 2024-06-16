package SirNaveen;

class Container{
	private int value;
	private boolean isAvailable=false;
	
	public synchronized void  put(int v) {
		while(isAvailable) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		isAvailable=true;
		value=v;
		this.notifyAll();
	}
	public synchronized int get(){
		while(!isAvailable) {
			try {
				this.wait();
			}
			catch(InterruptedException ee) {
				ee.printStackTrace();
			}
		}
		isAvailable=false;
		this.notifyAll();
		return value;
	}
}
class Producer extends Thread{
	private int value;
	private Container contain;
	Producer(int val, Container c){
		this.contain=c;
		this.value=val;
	}
	public void run() {
		for(int i=0; i<=value; i++) {
			contain.put(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	private Container contain;
	private int value;
	Consumer(Container c, int val){
		this.value=val;
		this.contain=c;
	}
	public void run() {
		for(int i=0; i<=value; i++) {
			System.out.println(contain.get());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Synchronization {
	public static void main(String[] args) {

		Container c= new Container();
		c.put(10);
		c.get();
		
		Producer p= new Producer(10, c);
		Consumer cc=new Consumer(c,10);
	
		p.start();
		cc.start();
		
	}
}
