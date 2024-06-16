package StaticKeyword;

public class StaticBlock {
	private static int a=4;
	private static int b;
	
	static {
		System.out.println("Static Block is called");
		b=a+5;
	}
	
	public static void main(String[] args) {
		StaticBlock obj1=new StaticBlock();
		System.out.println(a+" : "+b);
		
		StaticBlock.b+=3;
		
		System.out.println(a+" : "+b);
		
		StaticBlock obj2=new StaticBlock();
		System.out.println(a+" : "+b);
	}
// Note: static block will oly run once, when first object is created 
// means when class is loaded once 
}
