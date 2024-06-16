package Exception_Handling;


class Exception_Handling{
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

public class Exception1 {
	
	public static void main(String[] args) {
		
		Exception_Handling e = new Exception_Handling();
//		e.CreateException();   //Shows an Exception that / by zero.
		e.tryEx();
	
	}
	
	
	

}
