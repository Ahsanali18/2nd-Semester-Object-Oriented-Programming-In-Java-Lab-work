/*		Question-1 : By making the use of an single static array make it dynamic by using some algorithm but don't
 * 	    done it by using any other frameworks like arrays (another array).*/
package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class StaticToDynamicArray {

	public static void main(String[] args) {
//		int [] myArray= new int[5];	 --> 1st way to create/ define an array and then intialize the values by referencing the indices like A[0]=2...
		
		Scanner sc= new Scanner(System.in);
		
		int myArray[]= {2,4,5,6,7};
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print(myArray[i]);
			if(i<myArray.length-1) 
			{
				System.out.print(",");
			}
		}
		System.out.print("\nEnter elements: ");
		for(int i=0; i<myArray.length; i++)
		{
			int element=sc.nextInt();
		}
		System.out.println("Now array is: ");
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print(myArray[i]);
			if(i<myArray.length-1) 
			{
				System.out.print(",");
			}
		}

}
}