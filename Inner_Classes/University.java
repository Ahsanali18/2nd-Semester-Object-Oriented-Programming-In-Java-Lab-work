package InnerClasses;

import java.util.ArrayList;

public class University {
	ArrayList<Student> stdList=new ArrayList<>();
	class Student{
		private String stdName;
		private int gpa;
		
		public Student(String stdName, int gpa) {
			this.stdName=stdName;
			this.gpa=gpa;
		}
		public void display() {
			System.out.println("Student Name: "+stdName);
			System.out.println("Student GPA: "+gpa);
		}
	}
	public void addStudents(Student std) {
		stdList.add(std);
	}
	
	public static void main(String[] args) {
		University obj=new University();
		
		University.Student std1=obj.new Student("Ali",3);
		obj.addStudents(std1);
		std1.display();
		
		University.Student std2=obj.new Student("Ahmed",4);
		obj.addStudents(std2);
		std2.display();
	}
}
