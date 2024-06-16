package InnerClasses;

public class Outer {
	class Inner{
		private String name;
		private boolean married;
		
		public Inner(String name, boolean married) {
			this.name=name;
			this.married=married;
		}
		public void printInner() {
			System.out.println("Inner is being displayed");
		}
	}
	public void printOuter() {
		System.out.println("Outer is being displayed");
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		
		Outer.Inner inner=outer.new Inner("Ahmed",false);
		
		System.out.println(inner.name);
		
	}
	
}
