/* Task -2 
   Print the pattern like this :      *
                                      **
 									  ***
 									  *****  						*/
package Basics;

public class Usages_of_loops {

	public static void main(String[] args) {
		for(int i=1; i<5; i++)		//This loop is for printing stars on a row / Row wise
		{
			for(int j=1; j<=i; j++)
			{

				System.out.print("*");	//We can't use println b/w ln is for next line.
			}
			System.out.println(""); // or also --> System.out.print();
		}
	}
}
