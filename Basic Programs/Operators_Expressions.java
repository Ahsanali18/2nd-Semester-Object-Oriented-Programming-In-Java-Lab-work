package Basics;

public class Operators_Expressions {

	public static void main(String[] args) {
	
//				-------  OPERATORS AND EXPRESSIONS   -------
/*
 			Operators--> used to perform some specific operation on variables and values.\
 			Types:
 			1: Arithmetic Operators ==> (+,-,*,/,++,--)
 			2: Assignment Operators ==> (=, +=, -=, *=, /=, )
 			3: Comparison Operators ==> (==, !=, <=, >=)
 			4: Logical 	  Operators ==> ( &&, || ! )
 			5: Bitwise 	  Operators ==> ( | , & ^ ) 
 			Note-> Arithmetic Operators can't work with booleans (True/False).
 ------------------------------------- How Bitwise Operators works -----------------------------------------------
 			---------> & => if both same ->true  ) else false  
 			---------> | => if both false ->false ) else true
 			---------> ^ => if both opposite ->true ) else false   ^=(XOR) */
		
//									Arithmetic Operators
		/*int number1=4, number2=6;
		int addition=number1+number2; 			  	   //4+6 -> 10
		int subtraction=number1-number2; 		  	  // 4-6 -> -2
		int multiplication=number1*number2;		 	 // 4*6  -> 24
		float division=(float)number1/number2;	  	// 4/6   -> 0.6666
		
		System.out.print("Value of Number-1 is: "+number1);
		System.out.println(" <---> Value of Number-2 is: "+number2);
		System.out.println("Addition is: "+addition);
		System.out.println("Subtraction is: "+subtraction);
		System.out.println("Multiplication is: "+multiplication);
		System.out.println("Division is: "+division);
		
//									Assignment Operators
		int num1=4, num2=5;
		int sum=num1+=num2;  		// Expression resolved as ==> sum=num1+=num2 ==> sum=num1=num1+num2; Note-> num1=9
		System.out.println("Sum is: "+sum);
		
		int value=5;
		System.out.println("The original value is: "+value);
		value+=5;
		System.out.println("The value after +5 is: "+value);
		value-=5;
		System.out.println("The value after -5 is: "+value);
		value*=5;
		System.out.println("The value after *5 is: "+value);
		value/=5;
		System.out.println("The value after /5 is: "+value);
		*/
		
//									 Comparison Operators
		int value1=4;
		int value2=4;
		
		System.out.println("The value-1 is: "+value1);
		System.out.println("The value-2 is: "+value2);
		if(value1==value2)
			System.out.println("value-1 and value-2 are Equal.");
		else 
			System.out.println("value-1 and value-2 are not Equal.");
		
		/*String character1="A";
		char character2='A';
		if(character1==character2)   // Error --> Doesn't work --> Can't be compared.
		System.out.println("Equal characters");*/
		
		/*String number1="4";
		int number2=4;
		if(number1==number2)
			System.out.println("Equal Numbers.");  // Error --> Doesn't work --> Can't be compared
		else 
			System.out.println("Not Equal Numbers.");*/
		
		/*char x=2;
		  int y=3;
			if(x==y)
			 	System.out.println("x=y .");	// No Error --> But can't be compared accurately--> Can't be compared
			else 
				System.out.println("x!=y .");*/
		
//		Similarly we can also compare the int with float value and so on....
//		Note--> We can't compare the integer value with String and also we can't compare the String with char values.
		
	}

}