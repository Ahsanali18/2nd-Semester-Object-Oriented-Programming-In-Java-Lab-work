package Interface;

interface Computer{
	 /*by default public abstract*/ void code();
}

class Laptop implements Computer{ /*Laptop class implements Computer interface */
	public void code() {
		System.out.println("Run, Debug, code!");
	}
	
}

class Desktop implements Computer{
	public void code() {
		System.out.println("Run, Debug, code, Faster!");
	}
}

class Developer {
	public void devApp(Computer c) {
		c.code();
	}
}
public class InterfaceExample1 {
	public static void main(String[] args) {
		Laptop lap= new Laptop();
		Desktop ds= new Desktop();
		
		Developer xyz= new Developer();
		xyz.devApp(lap);
	}

}
