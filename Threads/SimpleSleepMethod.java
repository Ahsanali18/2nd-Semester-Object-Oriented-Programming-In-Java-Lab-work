package MultiThreading;

public class SimpleSleepMethod {
	public static void main(String[] args) /*throws InterruptedException*/ {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
