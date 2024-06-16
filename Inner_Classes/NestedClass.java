package SirMohsin;

class Bag{
	 static class Zipper{
		  public void zip() {
			System.out.println("Zipper is being Zipped");
		}
		public void unzip() {
			System.out.println("Zipper is being UnZipped");
		}
	}
	public void display() {
		System.out.println("Bag is being Displayed");
	}
}
public class NestedClass {
	public static void main(String[] args) {
		Bag bag=new Bag();
		bag.display();
		Bag.Zipper zipper= new Bag.Zipper(); // If static 
//		Bag.Zipper zipper= bag.new Zipper(); // If non-static
		zipper.zip();
		zipper.unzip();
	}
}
