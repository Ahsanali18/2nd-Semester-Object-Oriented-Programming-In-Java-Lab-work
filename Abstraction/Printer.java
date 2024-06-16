package AbstractClasses;

public abstract class Printer {
	protected String serial;
	protected String model;
	protected int price;
	protected short ppm;
	
	public Printer(String serial, String model, int price, short ppm) {
		this.serial=serial;
		this.model=model;
		this.price=price;
		this.ppm=ppm;
	}
	
	public abstract void print();
	public abstract void refill();
	
	public void setSerial(String serial) {this.serial=serial;} public String getSerial() {return serial;}
	
	public void setModel(String model) {this.model=model;} public String getModel() {return model;}
	
	public void setPrice(int price) {this.price=price;} public int getPrice() { return price;}
	
	public void setppm(short ppm) {this.ppm=ppm;} public short getppm() {return ppm;}
}
