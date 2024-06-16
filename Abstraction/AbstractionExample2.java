package Abstraction;

abstract class Shape{
	protected abstract double calculateArea();  
}

class Circle extends Shape{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	protected double calculateArea() {
		return Math.PI*radius*radius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	public double calculateArea() {
		return length*width;
	}
}

public class AbstractionExample2 {
	public static void main(String[] args) {
		Circle c= new Circle(5);
		Rectangle r= new Rectangle(2.4,2.7);
		
		double circleArea= c.calculateArea();
		double recArea= r.calculateArea();
		
		System.out.println("Circle's area is: "+circleArea);
		System.out.println("Rectange's are is: "+recArea);
	}
}

