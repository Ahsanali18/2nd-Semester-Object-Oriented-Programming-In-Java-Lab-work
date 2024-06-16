package Patterns;
import java.util.Scanner;

public class ReversePattern_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter range: ");
		int range=sc.nextInt();
		
		for(int i=1; i<=range; i++)
		{
			for(int j=range; j>=i; j--)
			{
				System.out.print("* ");
			}
		System.out.println();
	  }
	}
}
