package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

	class Student{			
		private String name;
		int age;
		Student(String n, int a)		// Constructor for student class
		{
			name=n;
			age=a;
		}
	
		public void printr() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		}	
}

public class Students_In_ArrayLists{

	public static void main(String agr[]) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Student> studentslists=new ArrayList<>();		//Creating an array list and storing the Student class Data.
		
		Student s1=new Student("ghulam hussain",19);	//Adding/Passing the data to Student class by creating objects.
		Student s2=new Student("ali",91);				//     .................Same as above one....................
		
//	Taking Data as an input from user and storing it in an arrayList by creating new Student constructor for each one.
		System.out.println("----------Enter Data----------");
		for(int i=0;i<4; i++) {
			System.out.print("Enter name of Student-["+(i+1)+"] ");
			String name=scan.next();
			System.out.print("Enter  age of Student-["+(i+1)+"] ");
			int age=scan.nextInt();
			studentslists.add(new Student(name,age)); //This is constructor i.e it stores the data for each student in an ArrayList.
		}
		
		studentslists.add(s1);		// Now at last adding the two more students object which we have defined before for loop.
		studentslists.add(s2);		//      ..................... Same as above ............................
		
		
		System.out.println("\n-------------Your Inserted Data is----------------");
		for(Student s:studentslists) {
			s.printr();		//Printing the whole data stored in arrayList after storing it in by using printr() method
						   //we can also use System.out.prinln() statement but our name is private so we cannot directly 
					       //print them that's why we have implemented the printr() method directly.
		}
	}
}
	

