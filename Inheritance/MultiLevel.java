package Inheritance;

class Class1{
	Class1(){
		System.out.println("Default Constructor of class2");
	}
	
	Class1(int c){
		System.out.println("Class1 constructor is called!");
	}
}

class Class2 extends Class1{
	
	Class2(){
		System.out.println("Default Constructor of class2");
	}
	Class2(int b){
		super(b);
		System.out.println("Class2 constructor is called!");
	}
}

class Class3 extends Class2{
	Class3(int a){
		super(a);
		System.out.println("Class3 constructor is called!");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
//		Class1 c1= new Class1();
//		Class2 c2=new Class2();
		
//		Class3 c3=new Class3();
		Class3 c3=new Class3(2);
	}
}
