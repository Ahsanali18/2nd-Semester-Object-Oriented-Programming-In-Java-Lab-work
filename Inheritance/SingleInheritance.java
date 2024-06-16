package Inheritance;
/*
Create a Java program that models different types of vehicles using inheritance. Define a base class called Vehicle with common attributes 
and behaviors such as make, model, year, and startEngine(). Implement at least two derived classes, such as Car and Motorcycle, that inherit
from the Vehicle class. Each derived class should have specific attributes and behaviors, such as numDoors for a car and hasSideCar for a 
motorcycle.
Additionally, 
implement methods in the derived classes to perform actions specific to each type of vehicle, such as accelerate() for a car and wheelie()
for a motorcycle.
*/

class Vehicle{
	protected String makeVehicle;
	protected int model, year;
	
	public Vehicle(String makeVehicle, int model, int year){
		this.makeVehicle=makeVehicle;
		this.model=model;
		this.year=year;
	}
	
	public void startEngine() {
		System.out.println("Enginer is being started..!");
	}
	public void display() {
		System.out.println("User's ordered to make"+this.makeVehicle+" Vehicle.");
		System.out.println("The model of the car is: "+this.model);
		System.out.println("The year of the car is: "+this.year);
	}
}

class Car extends Vehicle{
	private String carName;
	private int numOfDoors;
	
	public Car(String carName, int numOfDoors) {
		super("Car",2018,2024);
		this.carName=carName;
		this.numOfDoors=numOfDoors;
	}
	public void displayCar() {
		System.out.println("The Car name is: "+carName);
		System.out.println("The Car has "+numOfDoors+" doors!"+"\n");
	}
}

class Bike extends Vehicle{
	private String bikeName;
	private boolean hasSideCar;
	
	public Bike(String bikeName, boolean hasSideCar) {
		super("Bike",2016,2023);
		this.bikeName=bikeName;
		this.hasSideCar=hasSideCar;
	}
	public void displayBike() {
		System.out.println("The Bike name is: "+bikeName);
		System.out.println("The Bike has SideCar: "+hasSideCar+"\n");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Car myCar=new Car("Corolla", 4);
		myCar.display();
		System.out.println("\t\t---------Car's Details------------");
		myCar.displayCar();
		
		Bike myBike= new Bike("Yammah",true);
		myBike.display();
		System.out.println("\t\t---------Bike's Details------------");
		myBike.displayBike();
	}
}
