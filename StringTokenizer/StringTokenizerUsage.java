/* StringTokenizer --> A StringTokenizer is a class which is find in java.util pacakage this class allows us to
 					   break sentence or string into small tokens, It's a simple way to break the String. 
 					   It has some functions like:
 				
 	1- boolean: hasMoretTokens();  -->This function check if there is more tokens available.
 	2- String:  nextToken(); --> It returns the next token from StringTokenizer  object.
 	3- String:  nextToken(String delim); --> It returns next token based on the delimiter.
 	4- boolean: hasMoreElements(); -->The functionality of this function is same as hasMoreTokens();
 	5- Object:  nextElement(); --> Its functionality is same as nextToken(); but it's return type is object.
 	6- int:		countTokens(); --> It returns the total numbers of tokens from our string.		
 
 */
package StringTokenizers;

import java.util.StringTokenizer;		//Importing StringTokenizer --> Class

public class StringTokenizerUsage {

	public static void main(String[] args) {
		StringTokenizer st1= new StringTokenizer("Ahsan Ali Memon");
		StringTokenizer st2= new StringTokenizer("Ahsan Ali Memon");
		StringTokenizer st3= new StringTokenizer("Ahsan Ali Memon");
		
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());		//Prints the whole name stored in name literal.
		}
		
//	   ---------------------------- Alternate Method to do this same above work ---------------------------- 
		
		
		while(st2.hasMoreElements())
		{
			System.out.println(st2.nextElement());    //Prints the whole name stored in name literal.
		}
		
		
//	  -------------------------------- How to count the total tokens of string literal---------------------------
		System.out.println("Total Tokens are: "+st3.countTokens());
		
		
//	  -------------------------------- How to use the next.Token(String delim); ---------------------------------
		
		
		
	}
	
}