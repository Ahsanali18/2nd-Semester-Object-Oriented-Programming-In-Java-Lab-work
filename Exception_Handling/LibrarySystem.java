package ArrayLists_ExceptionHandling;
import java.util.ArrayList;

/*
Create a Java program to manage a library system. Define a class called Book with attributes such as title, author, and isbn. 
Implement a constructor and methods to get and set these attributes.
Next, create a class called Library that contains an ArrayList of Book objects. Implement methods in the Library class to add a book to the 
library, remove a book, and display all books in the library.

Additionally, create a class called LibraryUser that has attributes such as name, libraryId, and booksBorrowed, where booksBorrowed is an
ArrayList of Book objects. Implement a constructor in LibraryUser that takes a Library object as an argument, allowing a user to be associated 
with a specific library.

In the LibraryUser class, implement methods to borrow a book (add it to the booksBorrowed ArrayList), return a book (remove it from booksBorrowed),
and display the books currently borrowed by the user.*/

class Library{
	private ArrayList<Book> booklist=new ArrayList<Book>();
	
	public void addBooks(Book books) {
		booklist.add(books);
	}
	public void removeBooks(Book book) {
		for(Book b:booklist) {
		booklist.remove(book);
		}
	}
}

class Book{
	private String bookTitle;
	private String author;
	
	public Book(String bookTitle, String author) {
		this.bookTitle=bookTitle;
		this.author=author;
	}
	
	public void displayBook() {
		System.out.println("Book Titel is :"+bookTitle);
		System.out.println("Book author is: "+author);
	}
}

class LibraryUser{
	private String name;
	private String id;
	protected ArrayList<Book> borrowedBooks= new ArrayList<>();
	
	public LibraryUser(String name, String id){
		this.name=name;
		this.id=id;
	}
	public void borrowbooks(Book borrowBooks) {
		System.out.println(borrowedBooks.add(borrowBooks));
	}
	public void returnBooks(Book book) {
		for(Book bb:borrowedBooks);
			System.out.println(borrowedBooks.remove(book));
	}
	public void displayBooks() {
		for(Book bb:borrowedBooks) {
				bb.displayBook();
		}
	}
}
public class LibrarySystem {
	public static void main(String[] args) {
		Library lb=new Library();
		Book book=new Book("C++ Programming","Bjarne-Strustrup");
		LibraryUser lbuser=new LibraryUser("Ali","skpg");
		lb.addBooks(book);
		book.displayBook();
		
		Book borrowedBook=new Book("Java","XYZ");
		lbuser.borrowbooks(borrowedBook);
		lbuser.returnBooks(borrowedBook);
		
			
	}
}
