package Abstraction;
 //					Task (01) --> Explore  Basic Examples of Abstract classes & Interfaces

abstract class Car{
	public  abstract void drive();  
	void playMusic() {
		System.out.println("Music is being in the car!");
	}
	
}

class B_M_W extends Car{
	
	public void drive() {
		System.out.println("B_M_W is being drived!");
	}
	
}
public class AbstractionExample1 {
	public static void main(String[] args) {
//		Car bmw= new Car();  We can't create the object of abstract class (means abstract class can't be initiated)
		B_M_W b= new B_M_W();
		b.drive();
		b.playMusic();
	}
}
