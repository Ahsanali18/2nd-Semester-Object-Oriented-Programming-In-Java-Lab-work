package Interfaces;

class FastFood implements Restaurant{
	private String resName;
	private String resLocation;
	private String foodItems[];
	private double price[];
	
	public FastFood(String resName, String resLocation , String foodItems[] , double price[] ) {
		this.resName=resName;
		this.resLocation=resLocation;
		this.foodItems=foodItems;
		this.price=price;
	}
	public void showMenu() {
		System.out.println("Fast Food Menu");
		for(String items:foodItems) {
			System.out.println(items);
		}
		for(double price:price) {
			System.out.println(price);
		}
		
	}
	public void cookFood(String dish) {
		System.out.println(dish+" is being cooked");
	}
	public String deliver() {
		return null;
	}
	public String serve() {
		return null;
	}
	public void generateBill() {
		
	}
}

