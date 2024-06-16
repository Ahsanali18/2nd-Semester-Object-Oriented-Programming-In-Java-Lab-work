package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListUsage {

	public static void main(String[] args) {
	
	/*	
	 The purpose of using ArrayList is that we can implement the dynamic memory to arrays, efficient for storage
	 too, also it stores on heap memory and we use objects to create it, it doesn't work on primitive data types.*/
		
//	ArrayList <Integer> list= new ArrayList <>();   // We can use ArrayList like this
	ArrayList <Integer> list=new ArrayList<Integer>();	//Also like this one
	ArrayList <Integer> list2=new ArrayList<Integer>();	//Also like this one
	// Adding elements to LinkedList
	
	list.add(2);  //Here we provide the element/number which we wanna to add not index.
	list.add(5);
	list.add(9);
	list.add(0);
	
	
	System.out.println("The elements in Arraylist are: "+list);
	
	System.out.println(list);
	//To get the perticular number from a LinkedList.
	
	int numberAtIndex=list.get(0);
	System.out.println("The number @ index 0 is: "+numberAtIndex);
	
	// For setting element on a perticular index by replacing the previous one.
	
	list.set(1, 100);
	System.out.println(list);
	
	//For adding element at perticular index not by replacing the previous one.
	list.add(2, 5);
	System.out.println(list);
	
	//For sorting in arrays using the sort method
	for(int i=0; i<list.size(); i++)
	{
	Collections.sort(list);
	}
	System.out.println(list);
	
	list2.add(12);
	list2.add(13);
	list.addAll(list2);
	System.out.println("By adding the 2nd array list to 1st array list: "+list);
	/*
	 * boolean isNumberPresent=list.contains(100);
	 * System.out.println(isNumberPresent);
	 */
	
	
		//Cloning of ArrayList --> Make copy of same ArrayList  
	ArrayList <Integer> clonedList=(ArrayList<Integer>) list.clone();
	
	System.out.println(clonedList);
	
	clonedList.add(222);
	System.out.println(clonedList);
	
	System.out.println(list);
	
	
	System.out.println(list.subList(0, 3));		//This method is used to get elements from index 0 to 3 (excluding 3)
	
	clonedList.retainAll(list);			//Removes all the elements from clonedList that are not present in list
	System.out.println(clonedList);
	}
}