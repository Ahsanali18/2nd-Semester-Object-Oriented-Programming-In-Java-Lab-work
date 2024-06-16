package Strings;

public class Length_charAt_Methods {

	public static void main(String[] args) {
		
		String name="Ahsan Ali";
		int getTotalCharacters=name.length();
		System.out.println("Total Characters in String name are: "+getTotalCharacters);
		
		
		char getCharacterFromName=name.charAt(5);
		//Space character --> So gives Space
		System.out.println("The character at index [5] in string name is: "+getCharacterFromName); 
		
	}

}
