package Polymorphism;
/*	Compile Time Polymorphism ---> Method Overloading  --> signature + return type of methods--> doesn't matters*/
class CompileTimePolymorphism{
	
	public void add() {
		int a=9;
		int b=8;
		System.out.println("Addition= "+(a+b)+" No argument method.");
	}
	
	public void add(int a) {
		int b=9;
		System.out.println("Addition= "+(a+b)+" One argument method.");
	}
	
	public void add(int a, int b) {
		System.out.println("Addition= "+(a+b)+" Two argument method.");
	}
	
	public void add(float a, float b) {
		System.out.println("Addition= "+(a+b)+" Two argument method.");
	}	
}

public class MethodOverloading {
	public static void main(String[] args) {
		CompileTimePolymorphism overloading= new CompileTimePolymorphism();
		overloading.add(3);
		overloading.add();
		overloading.add(5f, 7f);
		overloading.add(2, 3);	
	}
}
