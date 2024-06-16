package AbstractClasses;

public class Test {
	public static void main(String[] args) {
		Printer laser=new LaserPrinter("MPV-4","Laser Pro",4000,(short)20,"LP-W",true,true);
		Printer inkjet=new InkjetPrinter("MUW-4","Inkjet Pro",5000, (short)30, "LP-WX Pro");
		
		laser.print();
		laser.refill();
		inkjet.print();
		inkjet.refill();
	}
}