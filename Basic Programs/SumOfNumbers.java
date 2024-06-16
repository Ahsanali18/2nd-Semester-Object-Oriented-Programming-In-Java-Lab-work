package Basics;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in); //Object of Scanner class is created as (obj) --> To take input from user 
		
		System.out.print("Enter first number: ");	
		int number1=obj.nextInt();
		
		System.out.print("Enter second number: ");
		int number2=obj.nextInt();
		
		System.out.print("Enter third number: ");
		int number3=obj.nextInt();
		
		int sum=number1+number2+number3;
		System.out.println("Sum of all Entered numbers is: "+sum);
	}

}
