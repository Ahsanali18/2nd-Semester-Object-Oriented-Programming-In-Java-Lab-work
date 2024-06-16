package package2;

import package1.ClassA;

public class ClassC {
	
	public static void main(String[] args) {
		ClassA pub= new ClassA();
		
		System.out.println("Accessing Public variable without extends keyword: "+pub.publicVar);
	}
		
}
