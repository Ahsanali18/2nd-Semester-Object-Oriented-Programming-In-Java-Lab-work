package ExceptionHandling;


class Exception_Handling1{
	int num1=3;
	int num2=0;
	
	void CreateException()
	{
		System.out.println(num1/num2);
	}
	void tryEx() {
	try {
		CreateException();
		System.out.println("Hello"); //Can't see this statement directly goes to catch block if it finds an exception
		}
	catch(Exception ee){
		num1=num1/5;
		}
	}
}

public class ExceptionHandling3 {
	
	public static void main(String[] args) {
		
		Exception_Handling1 e = new Exception_Handling1();
//		e.CreateException();   //Shows an Exception that / by zero.
		e.tryEx();
	
	}
	
	
	

}
