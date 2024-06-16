package Exception_Handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=8;
		
		int [] array= new int[5];
		String name=null;
		
		
		try {
			
//			int c=b/a;
//			System.out.println(c);
			System.out.println(array[5]);
			System.out.println(name.length());
		}
		/*
		catch(Exception e)
		{
			System.out.println("Error occurs...!");
		}*/
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception.");
		}
		
		catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("Array index Exception.");
		}
		
		
	}
}
