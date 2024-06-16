/*
Print the pattern like that--->   *****1 
								  ****12
								  ***123
								  **1234
								  *12345
*/
package Basics;

public class Pattern_4 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k);
			}
		System.out.println();
		}
	}

}
