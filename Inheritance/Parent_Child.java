package Inheritance;

class GrandParent{
	
	public GrandParent() {
		System.out.println("Grand Parent's constructor is called!");
	}
	/*
	public GrandParent(String name) {
		System.out.println("Grand Parent's name is: "+name);
	}*/
}

class Parent extends GrandParent{
//	public Parent() {
//		
//	}
	public Parent() {
		System.out.println("Parent's constructor is called!");
	}
}

class Child extends Parent{
	
	public Child(){
		System.out.println("Child's constructor is called!");
	}
	public Child(String name) {
		System.out.println("Child's name is: "+name);
	}
}

public class Parent_Child {
	public static void main(String[] args) {
//		GrandParent gp=new GrandParent();
//		Parent p=new Parent();
//		Child c=new Child();
		Child c=new Child("Ali");
	}
}
