package Basics;

public class VariablesUsage {

	public static void main(String[] args) {
			
//												Variables 
/*	Variables --> Variables are the containers that are used to store some values which can be execute by the java
 	program
 	E.g --> int myAge=17; here--> int => Data type, myAge => Variable Name, 17 => Value.
 	
 									Rules to create the variale name
 	01- It couldn't be start with number/digit. E.g --> int 1myAge ->(invalid).
 	02. White spaces are not allowed while choosing a variable name --> int my Age ->(invalid)
 	03. Keyowrds cannot be used/ choosed as a variable names. E.g --> int while=0; ->(invalid)
 	04. Name is case sensitive while declaring a variable. E.g --> String name="Ahsan"; & S.o.p(Name); -> (invalid)
 	05. They can also contains alphabets, symbols like -> ($,_) etc if above rules are followed. 
	
					Note: camelCaseConvention --> used to name the variables (Standard way).
 */
		int myAge=17;		//valid
		System.out.println("My Age is: "+myAge); 
				String name="Ahsan-Ali";
//		System.out.println("My name is: "+Name); //Invalidance --> in Name.
		System.out.println("My name is: "+name);
		

		String _fathersName="Muhammad Akram"; //valid can be start with underscore --> ( _ )
		System.out.println("Father's Name is: "+_fathersName);
	
		String $surName="Memon";  //valid can be start with dollar character --> ($)
		System.out.println("Sur name is: "+$surName);
		
//		String 1game="PUBG"; //Invalid can't start with digit or number.
		String game1="PUBG"; //valid
		System.out.println("I play the game: "+game1); //
		
		
		
	}

}
