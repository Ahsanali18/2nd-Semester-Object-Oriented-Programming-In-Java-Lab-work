package Interface;

interface Animal{
	public void eat();
	public void sleep();
}

class Dog implements Animal{
	public void eat() {
		System.out.println("Dog is eating!");
	}
	public void sleep() {
		System.out.println("Dog can sleep!");
	}
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		Animal e= new Dog();
		Dog puppy= new Dog();
		puppy.eat();
		puppy.sleep();	
	}
}
