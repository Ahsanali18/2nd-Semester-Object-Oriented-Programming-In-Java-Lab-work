package InnerClasses;

public class Vehicle {
	class  Engine{
		private String fuelType;
		private String engineType;
		
		public Engine(String fuelType, String engineType) {
			this.fuelType=fuelType;
			this.engineType=engineType;
		}
		public void engineDetails() {
			System.out.println("Engine type is: "+engineType);
			System.out.println("Fuel Type is: "+fuelType);
		}
	}
	public void details() {
		System.out.println("Vehicle is Corola");
		Vehicle.Engine engine=new Vehicle.Engine("Horse Engine","Patrol");
		engine.engineDetails();
	}
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.details();
	}
}
