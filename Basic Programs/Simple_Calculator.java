package Basics;
import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		int number1, number2;
		char operation;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		number1=sc.nextInt();
		
		System.out.print("Enter the operation which you want to perform (+,-,*,/): ");
		operation=sc.next().charAt(0);
		
		System.out.print("Enter second Number: ");
		number2=sc.nextInt();
		
		
		if(operation=='+')
		System.out.println("The sum of entered numbers is: "+(number1+number2));
		else if(operation=='-')
		System.out.println("The difference of entered numbers is: "+(number1-number2));
		else if(operation=='*')
		System.out.println("The Product of entered numbers is: "+(number1*number2));
		else if(operation=='/')
		System.out.println("The Divison of entered numbers is: "+((float)number1/number2));
		else
		System.out.println("Wrong operation please enter valid operator like (+,-,/,*)");
	}

}
