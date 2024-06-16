package ClassesRelations_Aggregation_ArrayLists;
import java.util.ArrayList;

/*
	   2-Book Class:
	   - Should store details about a book: name and publisher.
	   - Should allow setting and getting its name and publisher.
	   - Implement a method to print all details of the book.
	   - (Optional based on your implementation) Store information about the author(s). If supporting multiple authors, 
	     manage a list of `Person` objects representing the authors. Implement methods to add an author to a book and 
	     retrieve the book's authors.*/


public class Books {
	String bName;
	String publisher;
	ArrayList<Person> author= new ArrayList<>();
	
	public Books(String bName, String publisher){
		this.bName=bName;
		this.publisher=publisher;
	}
	public String getdata() {
		return bName+" "+publisher;
	}
	public void addAuthors(Person p) {
		author.add(p);
	}
	public void displayBookData() {
		System.out.println("Book name is: "+bName);
		System.out.println("Publisher name is: "+publisher);
		for(Person pp: author) {
			System.out.println("Author name is: "+pp.pName);
		}
	}
	

}
