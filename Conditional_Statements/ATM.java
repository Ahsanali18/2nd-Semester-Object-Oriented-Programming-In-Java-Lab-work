/*Make an ATM management system which counts the notes i.e Make a fixed value and store
in variable called amount and then make conditions that how many notes can be built from
that amount and also make condition for remainder variable. 
i.e amount = 2000 then ther is no any five thousand note then it means fk_note=0;
and similarly there is Two Tk_notes  comes in 2000 and fullfill the whole requirements so 
the notes before 1000 will also be zero. 
*/
package Basics;

public class ATM {
	public static void main(String[] args) {
		int amount=5450;
		int remainder;
		
		System.out.println("The Total amount is: "+amount);
		int fk_note=amount/5000;
		remainder=amount%5000;
		
		System.out.println("The total Fk notes are: "+fk_note);
		System.out.println("The remaining amount is: "+remainder);
		
		int tk_note=remainder/1000;
		remainder=amount%1000;
		if(remainder==0)
		{
		System.out.println("The total Tk notes are: "+tk_note);	
		System.out.println("The remaining amount is: "+remainder);
		}
		
		int hk_note=remainder/100;
		remainder=amount%100;
		if(remainder!=0)
		{
		System.out.println("The total Hk notes are: "+hk_note);
		System.out.println("The remaining amount is: "+remainder);
		}

		int fifk_note=remainder/50;
		remainder=amount%50;
		
		if(remainder==0)
		{
			System.out.println("The total Fifk notes are: "+ fifk_note);
			System.out.println("The reamaining amount is: "+remainder);	
		}
	}
}
