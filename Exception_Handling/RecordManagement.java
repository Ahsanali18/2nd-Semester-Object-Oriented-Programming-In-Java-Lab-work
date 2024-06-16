package ExceptioHandling_ArrayLists;

import java.util.ArrayList;

/* Write a Java program that demonstrates:
	- Exception handling techniques.
	- Manipulation of an `ArrayList` containing custom objects.

    - Define a class named `Record` with the following attributes --> String name`: int year`:
    - Provide an appropriate constructor to initialize these attributes
    
    Implement a public class named `RecordManagement` which will manage a collection of `Record` objects.
    This class should have an `ArrayList<Record>` to store the instances of `Record`.
    Implement a method `void addRecord(Record r)` that attempts to add a `Record` object to the collection.
    If the `Record`'s year is below 1996 or above 2023, the method should throw an `Exception` with a suitable 
    message indicating the issue.
    Implement a method `void printRecords()` that iterates through the collection and prints the details (name and year)
    of each `Record`.

    In the `main` method of `RecordManagement`, create an instance of `Record` with the name "My Song" and the year 1995.
    Use the `addRecord` method to attempt to add this record to the collection. Catch any exceptions thrown by `addRecord`
    and print a message indicating the record could not be added, including the reason. Also, add at least one valid 
    Record` to your collection and then call `printRecords()` to display the details of all records successfully added 
    to the system.
*/

class Record {
	String name;
	int year;
	Record(String name, int year){
		this.name=name;
		this.year=year;
	}
	public String toString() {
		return "RecordName: "+name+" RecordYear:"+year;
	}
}

public class RecordManagement{
	ArrayList <Record> reclist= new ArrayList<>();
	
	void addRecord(Record rec) throws Exception{
		if(rec.year<1996 || rec.year>2023) {
			throw new Exception("Record Year must in between 1996 and 2023");
		}
		else {
			reclist.add(rec);
		}	
	}
	void printRecord() {
		for(Record r: reclist) {
		System.out.println(r);
	  }
	}
	
	public static void main(String[] args) {
		RecordManagement management= new RecordManagement();
		Record r1= new Record("My Song", 1995);
		try {
		management.addRecord(r1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Record r2= new Record("Record1", 2022);
			management.addRecord(r2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		management.printRecord();	
/*		for (int i = 1; i <= 50; i++) {
		    String recordName = "Record" + i;
		    int recordYear = 1996 + (i - 1); // Example formula for year
		    try {
		        management.addRecord(new Record(recordName, recordYear));
		    } catch (Exception e) {
		        System.out.println("Could not add record: "+recordName+ ": "+e.getMessage());
		    }
		}
		management.printRecord();*/
	}
}

