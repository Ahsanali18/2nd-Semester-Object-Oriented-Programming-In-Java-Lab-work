package SuperKeyword3Usages;

class Parent{
	String name="Ali";
	public void display() {
		System.out.println("Parent Name is: "+name);
	}
}

class Child extends Parent{
	String name="Ahmed";
	public void print() {
		System.out.println("Child Name is: "+name);
		System.out.println("Parent Name is: "+super.name);
	}
}

public class SuperVariableCall {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.display();
		Child c= new Child();
		c.print();
	}

}
