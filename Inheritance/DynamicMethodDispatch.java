package Inheritance;

class Phone{
	public void dislayPhone() {
		System.out.println("Phone class method displayPhone() is called ");
	}
	
	public void game() {
		System.out.println("Gaming phone...!");
	}
}

class SmartPhone extends Phone{
	public void music() {
		System.out.println("Music method of Smart Phone is called");
	}

	public void game() {
		System.out.println("Gaming Smart Phone...!");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		Phone p= new SmartPhone();
		p.dislayPhone();
		p.game();
//		p.music();  
	
	}

}
