package StaticVariable;

public class StaticDataMembers {
	static private int number=0;
		private int num1=0;
		public int num2=0;
		
		void display()
		{
			System.out.println(num2);
		}
	public static void main(String[] args) {
	
		System.out.println(number);		//static private data member can be accessed directly in the main method without
										//creating instance of the class but likewise for only private data members without
										//static keyword we cannot access those directly we can access them by creating 
										//object/instance of the class only.
		StaticDataMembers sc=new StaticDataMembers();
		sc.num2=8; //If changed then also changed in main -- as well as also changed in class.
//					The value of num2 becomes 9 from 0 (permanently).
		System.out.println(sc.num1);
//		System.out.println(sc.num2);
		sc.display();
	}

}
