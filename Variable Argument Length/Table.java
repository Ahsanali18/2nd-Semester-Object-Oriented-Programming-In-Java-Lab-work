package SirMohsin;

public class Table {

	public static void main(String[] args) {
		
		int multiplyer=1;
		System.out.println("The Table of Number"+Integer.parseInt(args[0])+" upto range: "+Integer.parseInt(args[1]));
		for(int i=1; i<=Integer.parseInt(args[1]); i++) {
			System.out.println(Integer.parseInt(args[0])+"*"+multiplyer+"= "+Integer.parseInt(args[0])*multiplyer);
			multiplyer++;
		}
	}
	
}
