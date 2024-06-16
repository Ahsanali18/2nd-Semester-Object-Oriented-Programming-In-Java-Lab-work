package Inheritance;

class LivingThings{
	boolean isAlive;
	void reproduce() {
		
	}
}
class Plant extends LivingThings{
	void photoSynthesis() {
	
	}
}

class Animal extends LivingThings{
	void move() {
		
	}
}
class Herbivore extends Animal{
	Plant p=new Plant();
	void eatPlant(){
		
	}
}
class Carnivore extends Animal{
	//Herbivore hb= new Herbivore();	
	void hunt(/*Herbivore a  This is how we can interact the Carnivore class with Herbivore  */) {
		
	}
}

public class InheritanceLabTask1 {
	public static void main(String[] args) {
		Carnivore c= new Carnivore();
		c.hunt();
		c.move();
		c.reproduce();
		
		Herbivore hb= new Herbivore();
		hb.eatPlant();
		hb.move();
		hb.reproduce();
		
		Animal a= new Animal();
		a.move();
		a.reproduce();
		
		Plant p= new Plant();
		p.photoSynthesis();
		p.reproduce();
		
		
	}
}
