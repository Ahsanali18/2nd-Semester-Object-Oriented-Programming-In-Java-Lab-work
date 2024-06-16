package SirMohsin;

public class VariableArgumentLength {
	
	void display(String...name) {
		for(String names:name ) {
			System.out.print(names+" ");
		}
	}
	
	public static void main(String[] args) {
		VariableArgumentLength val= new VariableArgumentLength();
		
		System.out.println("\t\t\t\tSection -III ");
		val.display("Basit","Sachin","Soorat","Husnaak","Jibran","Dhani-Bux","Diljeet","Ammar","Ali","Muhammad-Ali\n\n");
		
		System.out.println("\t\t\t\tSection -II ");
		val.display("Achar","Ghulam-Mustafa","Ayyan","Mahrus","Sachin Kumar","Nouman","Jhazib","Sham Hirani\n\n");
		
		System.out.println("\t\t\t\tSection -I ");
		val.display("Ashar","Dayyand","Mustafa","Sumeet","Varoon","Deepak","Sooraj","Zeeshan");
	}
}
