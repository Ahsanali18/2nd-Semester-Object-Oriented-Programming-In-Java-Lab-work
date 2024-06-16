package Basics;
import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter boolean value ");
//		boolean input= sc.hasNextBoolean();
//		System.out.println(input);
		System.out.println("Enter any string: ");
//		boolean p=sc.hasNext();
		boolean p=sc.hasNext("hrllo");
		System.out.println(p);
	}

}
