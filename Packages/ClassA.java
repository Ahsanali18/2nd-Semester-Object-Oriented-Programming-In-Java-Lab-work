package package1;

public class ClassA {
	  
	  private   int privateVar  =10;  // private member --> scope --> only in class 
		 		int defaultVar  =20;  // Package-private (default access ) default member --> scope --> only in package
	  protected int protectedVar=30; //protected member --> scope -> Class + Package + Different Package (through extends)
	  public 	int publicVar   =40;  // public  member --> scope -> Everywhere -> Class+Package+DifferntPackage (easily)

	  
	  
	  public static void main(String[] args) {
		
		  ClassA all_access= new ClassA();
		  
		  System.out.println("Accesing private   variable in same pack--same class: "+all_access.privateVar);
		  System.out.println("Accesing default   variable in same pack--same class: "+all_access.defaultVar);
		  System.out.println("Accesing protected variable in same pack--same class: "+all_access.protectedVar);
		  System.out.println("Accesing public    variable in same pack--same class: "+all_access.publicVar);
	}
}


