package Loops;

public class NaturalNumbersInReverseOrder {

	public static void main(String[] args) {

		System.out.println("Natural Numbers");
		
		for(int i=50; i!=0; i--)
		{
			System.out.println(i+"\t"+(--i));
		}
		System.out.println("\n\t\tThe End..!");
	
	}
}
