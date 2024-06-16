package StaticKeyword;

public class Outer {
	
	static class Inner{
		private String name;
		private boolean married;
		private static int population;
		
		public Inner(String name, boolean married) {
			this.name=name;
			this.married=married;
			Inner.population+=1;
		}
	}
	
	public static void main(String[] args) {
		
		Inner obj1=new Inner("Ali",false);
		Inner obj2=new Inner("Ahmed",false);
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		
//		System.out.println(Inner.population);
//		System.out.println(Inner.population);
	}
}
