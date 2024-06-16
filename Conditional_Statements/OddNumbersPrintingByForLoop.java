package Loops;

import java.util.Scanner;

public class OddNumbersPrintingByForLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter range of Printing Odd Numbers: ");
		int range=sc.nextInt();
		
		for(int i=1; i<=range; i+=2)
		{
			System.out.println(i);
		}	
	}

}
