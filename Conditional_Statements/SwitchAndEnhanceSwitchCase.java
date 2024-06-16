package Conditions;

import java.util.Scanner;
public class SwitchAndEnhanceSwitchCase {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		
//		----------  Switch Case usage --> switch check condition for one variable having multiple cases  ----------
		
		switch (age){
			case 18: System.out.println("You are going to become an Adult.");break;
			case 23: System.out.println("You are going to join a Job.");break;
			case 60: System.out.println("You are going to be retired. ");break;
			default : System.out.println("Enjoy Your life.....!!!");break;	
		}
		
//		--------------- Enhanced switch in Java --> Same as switch case but syntax different little bit -------------
		
		System.out.print("Enter Your name: ");
		String name=sc.nextLine();
		
		switch (name) {
		case "Ahsan" -> System.out.println("Hello Ahsan...!");		//No need of break; keyword in enhanced switch case.
		case "Ahmed" -> System.out.println("Hello Ahmed...!");
		case "Ali" -> System.out.println("Hello Ali...!");
		default -> System.out.println("Hello "+name+" ...!");
		}
	}

	
}
