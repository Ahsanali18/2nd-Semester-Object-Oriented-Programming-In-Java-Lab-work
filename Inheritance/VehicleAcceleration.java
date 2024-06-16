package Inheritance;

class Vehicle{
	private String vehicleType;
	private String color;
	protected double acceleration;
	
	public Vehicle(String color, String vehicletype) {
		this.color=color;
		this.vehicleType=vehicletype;
	}
	public void display() {
		System.out.println("Vehicle Type is: "+vehicleType);
		System.out.println("Vehicle color is: "+color);
		System.out.println("Vehicle Acceleration is: "+acceleration);
	}
}

class Car extends Vehicle{
	private double speed;
	private double time;
	
	public Car(String color, String type, double speed, double time) {
		super(color,type);
		this.speed=speed;
		this.time=time;
		this.acceleration=calculateAcceleration();
	}
	
	public double calculateAcceleration() {
		return speed/time;
	}
	
	public void display() {
		super.display();
		System.out.println("Car Speed is: "+speed);
		System.out.println("Time is: "+time);
	}
}

class Bike extends Vehicle{
	private double speed;
	private double time;
	
	public Bike(String color, String type, double speed, double time) {
		super(color,type);
		this.speed=speed;
		this.time=time;
		this.acceleration=calculateAcceleration();
	}
	public double calculateAcceleration() {
		return speed/time;
	}
	public void display() {
		super.display();
		System.out.println("Bike speed is: "+speed);
		System.out.println("Time is: "+time);
	}
}


public class VehicleAcceleration {
	public static void main(String[] args) {
		Car c=new Car("Black","Corola",22,1);
		Bike b=new Bike("Red","CD-70",33,2);
		c.display();
		b.display();
	}
}
