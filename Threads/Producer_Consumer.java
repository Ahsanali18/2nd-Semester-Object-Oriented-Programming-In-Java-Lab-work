package SirNaveen;
class Containerr{
	private int values;
	private boolean isAvailable=false;
	
	synchronized public void put(int values) {
		while(isAvailable) {
		try {
			wait();
		}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		isAvailable=true;
		this.values=values;
		notifyAll();
	}
	synchronized public int get(int values) {
		while(!isAvailable) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.values=values;
		notifyAll();
		return values;
	}
}
class Producerr extends Thread{
	private int values;
	private Containerr contain;
	
	public Producerr(Containerr c, int values) {
		this.contain=c;
		this.values=values;
	}
	
	public void run() {
		for(int i=1; i<=values; i++) {
			this.contain.put(values);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
class Consumerr extends Thread{
	private int values;
	private Containerr contain;
	
	public Consumerr(int values, Containerr contain) {
		this.values=values;
		this.contain=contain;
	}
	
	public void run() {
		for(int i=1; i<=values; i++) {
			System.out.println(this.contain.get(values)); 
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Producer_Consumer {
	public static void main(String[] args) {
		Containerr c= new Containerr();
		Producerr p= new Producerr(c,5);
		Consumerr cc = new Consumerr(5,c);
		p.start();
		cc.start();
	}
}


