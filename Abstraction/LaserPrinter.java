package AbstractClasses;

public class LaserPrinter extends Printer{
	private String tonerType;
	private boolean duplexModel;
	private boolean scanner;
	
	public LaserPrinter(String serial, String model, int price, short ppm,String tonerType, boolean duplexModel, boolean scanner) {
		super(serial, model, price,ppm);
		this.tonerType=tonerType;
		this.duplexModel=duplexModel;
		this.scanner=scanner;
	}
	
	public void setTonerType(String tonerType) {
		this.tonerType=tonerType;
	}
	public String getTonerType() {
		return tonerType;
	}
	public void setDuplexModel(boolean duplexModel) {
		this.duplexModel=duplexModel;
	}
	public boolean getDuplexModel() {
		return duplexModel;
	}
	public void setScanner(boolean scanner) {
		this.scanner=scanner;
	}
	public boolean getScanner() {
		return scanner;
	}
	
	@Override
	public void print() {
		System.out.println("Printing with Laser Printer having Model: "+getModel()+" : Serial: "+getSerial()+" : Price: "+getPrice()+": PPM: "+getppm());
	}
	@Override
	public void refill() {
		System.out.println("Refiling Toner Cartidge for Laser Printer having TonerType: "+getTonerType()+" : Duplex Model: "+getDuplexModel()+" : Scanner: "+getScanner());
	}
}
