package ExceptionHandling;
class ExceptionCreation{
	
	void function() {
		int [] Array1= new int [5];
		try {
		
		Array1[0]=4;
		Array1[1]=2;
		Array1[2]=3;
		Array1[3]=8;
		Array1[4]=9;
		System.out.println(Array1[5]);
		//This couldn't handle this exception i.e it terminates after handling the array index out of bound. 
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index error.");
//			E.function();
		}
		try {
		  int a=9;
		  System.out.println(a/0);
		}
		 catch(ArithmeticException p) {
			System.out.println("Arithmetic error.");
		}	
	}
}

public class ExceptionHandling2 {

	public static void main(String[] args) {
		ExceptionCreation E= new ExceptionCreation();	
		E.function();
//		catch(Exception e){
//			System.out.println("Array index out of bounds.");
//		}
		
		
	}

}
