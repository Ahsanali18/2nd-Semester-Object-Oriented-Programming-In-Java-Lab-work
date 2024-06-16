package ClassesRelations_Aggregation_ArrayLists;

import java.util.ArrayList;

/*
1. Person Class:
	   - Should store personal details: name and age.
	   - Should maintain a list of books that the person has written (`ArrayList<Book>`).
	   - Implement methods to:
	     - Add a book to the person's list of written books.
	     - Print the person's details (name and age).
	     - Get the list of books the person has written.
*/

public class Person {
	
	String pName;
	byte pAge;
	ArrayList<Books> booklist=new ArrayList<>();
	
	public Person(String pName, byte pAge) {
		this.pName=pName;
		this.pAge=pAge;
	}
	public String getDetails() {
		return pName+" "+pAge;
	}
	public void addBooks(Books b) {
		booklist.add(b);
	}
	public void displayPersonDetails() {
			System.out.println("Person Name is: "+pName);
			System.out.println("Person's Age is: "+pAge);
			for(Books b:booklist) {
				System.out.println("Book name is: "+b.bName);
			}
	}
	
}
