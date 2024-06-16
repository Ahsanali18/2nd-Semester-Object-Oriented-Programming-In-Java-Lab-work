/* Write a program to calculate the percentage of a given student in CBSE passed exam. His marks from 5 subjects must 
   be taken as input from keyboard*/
package Basics;

import java.util.Scanner;
public class PercentageCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter marks of Subject-1: ");
		int sub1Marks=sc.nextInt();
		System.out.println("Enter marks of Subject-2: ");
		int sub2Marks=sc.nextInt();
		System.out.println("Enter marks of Subject-3: ");
		int sub3Marks=sc.nextInt();
		System.out.println("Enter marks of Subject-4: ");
		int sub4Marks=sc.nextInt();
		System.out.println("Enter Total marks of all subjects: ");
		int totalMarks=sc.nextInt();
		int obtainedMarks=sub1Marks+sub2Marks+sub3Marks+sub4Marks;
		float percentage= ((float)obtainedMarks/totalMarks)*100;
		System.out.println("Percentage you obtained is: "+percentage +"%");
		
	}

}
