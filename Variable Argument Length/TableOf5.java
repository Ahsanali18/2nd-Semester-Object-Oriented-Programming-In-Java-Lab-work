package SirMohsin; 

//import java.util.Integer;

public class TableOf5{
	public static void main(String args[]){
		int multiplyer=1;
		System.out.println("Table of 5 is:");
		for(int i=1; i<=10; i++){
			System.out.println(Integer.parseInt(args[0])+"*"+multiplyer+"= "+Integer.parseInt(args[0])*multiplyer);
			multiplyer++;
		}
	}
}