package Patterns;
import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Range: ");
		int range=sc.nextInt();
		
		for(int i=1; i<=range; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+i);
			}
			System.out.println();
		}
	}

}
