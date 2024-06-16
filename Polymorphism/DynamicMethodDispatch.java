package Polymorphism;

class Shape{
	public void area() {
		System.out.println("Iam in shapes");
	}
}

class Square extends Shape{
	@Override
	public void area() {
		System.out.println("Square area is area=length*width");
	}
}
class Circle extends Shape{
	@Override
	public void area() {
		System.out.println("Circle area is area=2*pi*r*r");
	}
	
	public void intro() {
		System.out.println("Iam Circle");
	}
}
public class DynamicMethodDispatch {
	public static void main(String[] args) {
		Shape circle=new Circle();   // Up-Casting (Reference of Parent --> Object of Child class)
		circle.area();  // A call to an overriden method is determined at runtime
//		circle.intro(); can't be called b/c reference is of parent Class so it depends on parent class that which method is called
		Shape square=new Square();	 // Up-Casting (Reference of Parent --> Object of Child class)
		square.area();
	}
	
	
	
}
