package Aggregation_Composition;


class Engine{
	private String engineType;
	
	public Engine(String engineTyp){
		this.engineType=engineTyp;
	}
	public String getType() {
		return engineType;
	}
}

class Car{
	
	private Engine engine;
	private String model;
	
	public Car(String mod, Engine eng) {
		this.model=mod;
		this.engine=eng;
	}
	
	public void start() {
		System.out.println("The "+model+" car with a "+engine.getType()+" engine starts.");
	}
	
}

public class Aggregation1 {
	public static void main(String[] args) {
		Engine myEngine=new Engine("V8");
		Car myCar= new Car("Civic",myEngine);
		
		myCar.start();
	}
}
