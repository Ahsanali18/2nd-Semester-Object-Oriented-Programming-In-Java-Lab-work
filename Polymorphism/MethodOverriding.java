package Polymorphism;
/* Runtime Polymorphism --> Method Overriding --> method signature + return of methods matters
Note --> Only methods could be overrided because same signatures i.e data types names etc
		 Can't be applied on Constructor because in Contructor we use class name	*/

class ParentClass{
	
	public void add(int a, int b) {
		System.out.println("Addition= "+(a+b)+" Parent Class method is called");
	}
}
class ChildClass extends ParentClass{
	
	public void add(int a, int b) {
		System.out.println("Additio= "+(a+b)+" Child Class method is called");
		super.add(4, 5); // super method calls within the method it calls the ParentClass methods -> instead of creating
//							object of that class.
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		cc.add(4, 4);
	}
}
