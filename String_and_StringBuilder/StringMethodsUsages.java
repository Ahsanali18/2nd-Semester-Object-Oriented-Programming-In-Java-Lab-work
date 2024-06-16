package Strings_StringBuilders_StringTokenizers;

public class StringMethodsUsages {

	public static void main(String[] args) {
//			String name=new String("Ahsan");		--> First way to assign the values to the string.
			String name="Ahsan";				//  --> Second way to assign the values to the string (commonly used).
			
			System.out.println("The original Name is: "+name);
			int value=name.length();
			System.out.println("The Length of the String is: "+value);

			String lstring=name.toLowerCase();
			System.out.println("The name after using toLowerCase() function: "+lstring);
			
			String ustring=name.toUpperCase();
			System.out.println("The name after using toUpperCase() function: "+ustring);
			System.out.println("\n\n************************************************\n");
			String nonTrimString="        Ahsan         ";
			System.out.println("The non-trimed String is: "+nonTrimString);
			
			String trimedString=nonTrimString.trim();   // --> trim(); removes spaces from back and front of the string.
			System.out.println("The trimed String is: "+trimedString);
			
			String subStringName1=name.substring(3);
			System.out.println("The name after using substring() of one argument function is: "+subStringName1);
			
			String subStringName2=name.substring(1, 3);
			System.out.println("The name after using substring() of two arguments function is: "+subStringName2);
			
			String replacedName1=name.replace('A', 'E');	   //replace(); function having char values --> replace one char
			System.out.println("The name after replacing A by E by using replace() functions which replaces the "
			+ "character is: " +replacedName1);
			
			String replacedName2=name.replace("san", "med");
			System.out.println("The name after replacing (san) by (med) by using replace() function which replaces the "
			+ "number of characters is: "+replacedName2);
			
			boolean checkStringStartingCharacters=name.startsWith("Ahs");
			System.out.println("The ans/bool value of name using startsWith() function is :"+checkStringStartingCharacters); //If incorrect > false
			
			
			boolean checkStringEndingCharacters=name.endsWith("an");
			System.out.println("The ans/bool value of name using endsWith() function is: "+checkStringEndingCharacters); //If incorrect > false
			
			char checkCharacterAtPerticularIndex=name.charAt(2);
			System.out.println("The character at provided index identified by charAt() function is: "+checkCharacterAtPerticularIndex); 
			
			
			
	}

}
