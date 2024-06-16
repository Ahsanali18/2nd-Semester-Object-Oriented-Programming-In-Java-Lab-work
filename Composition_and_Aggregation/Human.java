package ClassesRelations_Aggregation_ArrayLists;

import java.util.ArrayList;
/*
	     3-Humans Class:
	   	 - Should maintain a collection of `Person` objects (`ArrayList<Person>`).
	   	 - Implement methods to:
	     - Add a new `Person` to the collection.
	     - Retrieve a `Person` by name.
	     - Print all data related to a specific `Person` by name, including their written books.
*/

public class Human {
	ArrayList<Person> persons= new ArrayList<Person>();
	
	void addPersons(Person p) {
		persons.add(p);
	}
	public String getPersonName() {
		return persons.toString();
	}
	public void PrintDetails() {
		System.out.println("Peson Name is: "+persons.toString());
//		System.out.println("Person Age is: "+persons);
		System.out.println();
	}

}
