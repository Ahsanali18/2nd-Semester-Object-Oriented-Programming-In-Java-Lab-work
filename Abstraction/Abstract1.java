package Abstraction;

class A1 extends A2 /*Gives error i.e to give body to methods of abstract class or use abstract keyword*/{
	void abs() {
		System.out.println("Normal Method");
	}
// void ubs(); // error --> method require a body also give empty body but give body --> but if we wanna to hide it.
	
//	Now we wanna to gave body then this class can be extended otherwise not 
	void ubs() {
		
	}
}

abstract class A2{
	
//	abstract int a=20;  variables cannot be maded abstract 
//	abstract A2(); // constructor cannot be maded abstract because it cannot be overrided thats why and we have 
//					  to give body  --> constructors cannot be overriden thats why they cannot be maded as abstract
	
	
	
	void abs() {
		System.out.println("Normal Method");
	}
	abstract void ubs();  // now its implementation hided we didn't give its body
	
	
} 

// Intefaces --> with interfaces we donot write classe

interface I1{
	
	
}

public class Abstract1 {
	
	
	
	
	public static void main(String[] args) {
		
	}
}
