package AbstractClasses;

public class InkjetPrinter extends Printer {
	private String cartidgeType;
	
	public InkjetPrinter(String serial, String model, int price, short ppm, String cartidgeType) {
		super(serial, model, price, ppm);
		this.cartidgeType=cartidgeType;
	}
	
	public void setCartidgeType(String cartidgeType) {
		this.cartidgeType=cartidgeType;
	}
	public String getCartidgeType() {
		return cartidgeType;
	}
	
	@Override
	public void print() {
		System.out.println("Printing with Inkject Printer having Model: "+getModel()+", Serial: "+getSerial()+", Price: "+getPrice()+" , PPM: "+getppm());
	}
	@Override
	public void refill() {
		System.out.println("Refiling cartidgeType of Inkjet Printer having cartidgeType: "+getCartidgeType());
	}
}
