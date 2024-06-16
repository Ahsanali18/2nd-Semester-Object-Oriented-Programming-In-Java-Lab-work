package Arrays;

import java.util.Arrays;
public class ArrayFunctionUsages {

	public static void main(String[] args) {
		int [] Array1= new int [5];
		int [] Array2= new int [5];
		
		Array1[0]=4;
		Array1[1]=2;
		Array1[2]=3;			//Another way to initialize an array --> int A[]= {2,3,4,5};
		Array1[3]=8;
		Array1[4]=9;		

		
//------------  First Method to Copy all the array Elements to another Array by using copyOf() function  -----------
		
		Array2=Arrays.copyOf(Array1, Array1.length);
		
		for(int i=0; i<Array2.length; i++)
		{
			System.out.print(Array2[i]);
			if(i<4)
			System.out.print(" , ");
		}
		
		
// --------------------- Second Approach to Copy the first array Elements to another array -----------------------------
			/*
			for(int i=0; i<Array1.length;i++)
			{
				Array2[i]=Array1[i];
			}
			 System.out.println("The Elements of 1st Array are: ");
				for(int i=0; i<Array1.length; i++)
				{
					System.out.print(Array1[i]);
					if(i!=4)
					System.out.print(" , ");
				}
				for(int i=0; i<Array1.length; i++)
						System.out.println(Array2[i]); */
// --------------- Second Approach to print the array Elements by using For-each loop ---------------------------
		
/*		for(int a:Array2)
		{
		System.out.print(a);
		if(a<5)
		System.out.print(" , ");
		}
		*/
		
/*		Note
		toString(arr); --> to display the copy done or not.
		Arrays.sort(Array2);--> Sorting of second array by using sort function to check whether the elements copied or not
		*/		
	}
}
