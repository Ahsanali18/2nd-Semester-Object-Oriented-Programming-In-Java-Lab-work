package Aggregation_Composition;

class Wheels{
	private int numberOfWheels;
	
	public Wheels(int noOfWheels) {
		this.numberOfWheels=noOfWheels;
	}
	
	public int getWheels() {
		return numberOfWheels;
	}
}


class Carr{
	String model;
	String engineType;
	Wheels[] wheels;
	
	public Carr(String model, String engineType, Wheels[] wheels) {
		this.model=model;
		this.engineType=engineType;
		this.wheels=wheels;
	}
	
	void printDetails() {
		
		int totalWheels=0;
		for(Wheels w: wheels) {
			totalWheels+=w.getWheels();
			
		}
		System.out.println("The "+model+" Car has an engineType "+engineType+" is composed Of "+totalWheels+" wheels");
	}
	
}

public class Composition1 {
		
	public static void main(String[] args) {
	
		Wheels[] wheels= new Wheels[4];
		for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheels(1); // Initialize each wheel. Assuming each represents 1 wheel.
        }
		Carr myCarr= new Carr("Corolla","V8",wheels);
		
		myCarr.printDetails();
	}

}
