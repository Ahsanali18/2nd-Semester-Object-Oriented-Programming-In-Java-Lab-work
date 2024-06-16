package FinalKeywords;

public class M1 {
	private final double PI_VALUE;
	
	public M1() {
		PI_VALUE=3.14;
	}
	
	public static void main(String[] args) {
		M1 obj=new M1();
//		obj.PI_VALUE=20; //Error can't chage final variables value
		System.out.println(obj.PI_VALUE);
	}
	
}
