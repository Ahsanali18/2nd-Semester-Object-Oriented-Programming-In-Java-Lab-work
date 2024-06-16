package SuperKeyword3Usages;

class SuperClass{
	SuperClass(String name){
		name="Parent";
		System.out.println(name+" constructor is called!");
	}
	
}
class SubClass extends SuperClass{
	SubClass(String name){
		super(name);
		System.out.println(name+" constructor is called!");
	}
}
public class SuperConstructorCall {
	public static void main(String[] args) {
		SubClass c= new SubClass("Child");
	}
}
