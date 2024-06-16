package StaticKeyword;

public class Human {
	private String name;
	private int age;
	private boolean married;
	
	private static int population;
	
	public Human(String name, int age, boolean married) {
		this.name=name;
		this.age=age;
		this.married=married;
		Human.population+=1;
	}
	public static void main(String[] args) {
		Human ahmed=new Human("Ahmed",14,false);
		Human akbar=new Human("Akbar",15,false);
		
//		new Human("Ali",16,true);
		
		System.out.println(Human.population);
		System.out.println(Human.population);
		
	}
}
