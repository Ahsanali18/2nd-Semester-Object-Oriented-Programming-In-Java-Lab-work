package LinkedLists;
import java.util.ArrayList;
import java.util.Arrays;

public class DeleteMatchNameByArrayList {

	public static void main(String[] args) {
		
		String [] Array1={"Ahsan","Ali","Ahmed","Aqib"};
		
		String[] Array2=new String[4];
		
		System.out.print("The Original Array is: Array1[]={");
		for(int i=0; i<Array1.length; i++)								//For Displaying the Elements/Values that we have assigned to our array
		{
			System.out.print(Array1[i]);
			if(i<3)
			System.out.print(" , ");
			if(i==3)
			{
			System.out.print("}\n");
			System.out.println("----------------------------------------------------------------");
			}
		}	
//		System.arraycopy(Array1, 0, Array2, 0, Array1.length); -->More efficient than copyOf copies the portion of original array
		Array2=Arrays.copyOf(Array1, Array1.length);
		
		System.out.print("The 2nd/copied Array is: Array2[]={");
		for(int i=0; i<Array1.length; i++)								//For Checking the Elements/Values of Copied Array is copied/Not.
		{
			System.out.print(Array2[i]);
			if(i<3)
			System.out.print(" , ");
			if(i==3)
			{
			System.out.print("}\n");
			System.out.println("----------------------------------------------------------------");
			}
		}
		
//		-----------Task--------------	Object Delete Logic ------------------ Not By using index logic ---------------Task------------------
		
		//Create ArrayList from the Array2
		
//		ArrayList<String> A =new ArrayList<String>();  -> 1st way
		ArrayList<String> A = new ArrayList<>();
		for(String element:Array2)			//For each loop is used to add all the elements of Array2 in ArrayList 'A'
		{
			A.add(element);
		}
		
		//Delete Data by matching names in both arrays
		String deleteName="Ahmed";		//Name defined which we goona to delete in updated/copied array.
		A.remove(deleteName);		   //Remove the name 
		
		System.out.println("The updated array is: Array2[]="+A+" --> deleted name is  --> "+deleteName+ " X");
	}	
}
		
		
		
//-----------------Task-------------------	Name Delete  ------------------ By using index logic ---------------Task------------------
	
		/*
		Array2=Arrays.copyOf(Array1, Array.getLength(Array2));		//Copy of Array1[] is created in Array2[] 
		
		System.out.print("The Copied Array is: Array2[]= {");
		for(int i=0; i<Array1.length; i++)			//For Checking the Elements/Values of Copied Array is copied/Not.
		{
			System.out.print(Array2[i]);
			if(i<3)
			System.out.print(" , ");
			if(i==3)
			System.out.print("}");
		}
		
		//In this Step we Gonna to create an ArrayList and adding the elements of our copied/secondArray to it 
		
		ArrayList<String> A = new ArrayList<>();
		for(String element:Array2)
		{
			A.add(element);
		}
		
		String deleteName="Ahmed";
		for(int i=0; i<A.size(); i++)
		{
			if(A.get(i).equals(deleteName)) 
			{
				A.remove(i);
				break;
			}
		}
		System.out.println("\nArray List after deleting "+deleteName+" : "+A);*/
	

