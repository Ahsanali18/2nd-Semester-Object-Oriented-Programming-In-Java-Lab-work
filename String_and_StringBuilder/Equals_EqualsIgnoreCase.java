package Strings;

public class Equals_EqualsIgnoreCase {

	public static void main(String[] args) {
		/*
		String name="Ahsan";
		boolean compareIfEqual=name.equals("Ahsan");
		System.out.println("The strings are compared and result is "+compareIfEqual);
		
		boolean compareNamesIgnoreCase=name.equalsIgnoreCase("AHSAN");
		System.out.println("The strings are compared by ignoring case: "+compareNamesIgnoreCase);
		*/
		String name1="AHSAN ";
		String name2="Ahsan";
		int compare=name1.compareTo(name2);
	
		
		/*
		System.out.println("The string compare "+compare);
		name1=name1.toLowerCase();
		
		System.out.println("Lower case string is: "+name1);
		
		System.out.println(name1);
		*/
		int result =name1.compareToIgnoreCase("Ehsan");
		System.out.println(result);
		
		
	
	}

}
