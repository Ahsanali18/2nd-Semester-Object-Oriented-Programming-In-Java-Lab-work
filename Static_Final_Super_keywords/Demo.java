package StaticKeyword;

public class Demo {
	public static void main(String[] args) {
		Demo.message();
	}
	
	
	static void message() {
		Demo d=new Demo();
		d.fun1();
		System.out.println("Hello World!");
	}
	
	void fun1() {
		System.out.println("Fun1 is called");
	}
	
}
