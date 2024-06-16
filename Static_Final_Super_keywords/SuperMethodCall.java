package SuperKeyword3Usages;

class ParentClass{
	
	public void display() {
		System.out.println("Parent class method is called!");
	}
}

class ChildClass extends ParentClass{
	
	@Override
	public void display() {
		System.out.println("Child class method is called!");
		super.display();
	}
}

public class SuperMethodCall {

	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.display();
	}

}
