package Inheritance;

class Shape{
	protected String color;
	protected double area;
	
	public Shape(String color) {
		this.color=color;
	}
	
	public void display() {
		System.out.println("Shape color is: "+color);
		System.out.println("Shape area is: "+area);
	}
}

class Circle extends Shape{
	private final double PI=3.14;
	private final int value=2;
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
		this.area=calculateArea();

	}
	
	public double calculateArea() {
		return value*PI*radius;
	}
	
	public void display() {
		super.display();
		System.out.println("Radius is: "+radius);
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length=length;
		this.width=width;
		this.area=calculateArea();
		
		
	}
	
	public double calculateArea() {
		return length*width;
	}
	public void display() {
		super.display();
		System.out.println("Length is: "+length);
		System.out.println("Width is: "+width);
	}
}

public class Circle_RectangeArea {
	public static void main(String[] args) {
		Circle c=new Circle("Red Circle",4.5);
		Rectangle r=new Rectangle("Blue Rectangle",5.5,5.5);
		c.display();
		r.display();
	}
}
 