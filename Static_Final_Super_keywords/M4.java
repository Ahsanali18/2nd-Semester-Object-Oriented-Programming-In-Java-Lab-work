package FinalKeywords;

class Person{
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
public class M4 {
	public static void main(String[] args) {
		final Person ali=new Person("Ali",23);
//		ali.name="New Name"; we can do this 
		
//		ali=new Person("New Name",23); can't do this 
	}
}
