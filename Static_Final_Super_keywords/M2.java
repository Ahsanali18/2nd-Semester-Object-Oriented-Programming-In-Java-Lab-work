package FinalKeywords;

class Parent{
	private String name;
	private int age;
	
	public Parent(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public final void greeting() {
		System.out.println("Parent is greeting!");
	}
}

class Child extends Parent{

	public Child(String name, int age) {
		super(name,age);
	}
	
/*	@Override
	public final void greeting() {
		System.out.println("Child is greeting!");
	}*/
//		Error cannot override the final methods
}

public class M2 {

}
