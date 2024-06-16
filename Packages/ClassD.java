package package2;

import package1.ClassA;

public class ClassD extends  ClassA{
	
		public static void main(String[] args) {
			
			ClassD pro_pub= new ClassD();
			
			System.out.println("Accessing protected variable in another package through extends: "+pro_pub.protectedVar);
			System.out.println("Accessing public variable in another package through extends: "+pro_pub.publicVar);
			
		}
}
