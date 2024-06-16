package package1;

public class ClassB {
	
		public static void main(String[] args) {
			ClassA access= new ClassA();

			System.out.println("Accesing default variable in same pack--other class: "+access.defaultVar);
			System.out.println("Accesing protected variable in same pack--other class: "+access.protectedVar);
			System.out.println("Accesing public variable in same pack--other class: "+access.publicVar);
		}
		
}
