package ExceptionHandling;

//ArithmeticExceptions-->extends-->RuntimeExceptionClass-->Exception-Class-->extends-->ThrowableClass-->Implements-->SerializableClass/

//Exception -->  RuntimeException(unchecked Exception) --> depends on user to handle or not + IO and SQl Exception(CheckedException)--> must be handled. 
public class ExceptionHandling1 {
	
	public static void main(String[] args) {
		
		int i=2;
		int j=0;
		
		int nums[]= new int[5];
			
		try {
			j=i/j;
		}
		
		catch(Exception e)
		{
			if(e instanceof ArithmeticException)
				System.out.println("Arithmetic Exception occurs...!");
			else if( e instanceof ArrayIndexOutOfBoundsException )
				System.out.println("ArrayIndexOutOfBoundsException occurs...!");
		}
			
		/*try {
			j=18/j;			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception-1: Algebraic Exception --> "+e);
		}
		System.out.println("............................................................................................");
		try {
			System.out.println(nums[5]);
		}
		catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("Array Exception..!"+ee);
		}*/
	}
}
