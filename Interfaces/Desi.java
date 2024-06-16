package Interfaces;

public class Desi implements Resturant{
	private String resName;
	private String resLocation;
	private String foodItems[]= {"Biryani","Tandoori","Naan","Qorma"};
	private double price[]= {300,40,30,550};
	
	public Desi(String resName, String resLocation) {
		this.resName=resName;
		this.resLocation=resLocation;
	}

	@Override
	public void showMenu() {
		System.out.println("Menu of Resturant "+resName);
		System.out.println("Food Items : Price");
		for(int i=0; i<foodItems.length;i++) {
			System.out.println(foodItems[i]+" : "+price[i]);
		}
	}
	
	@Override
	public void cookFood(String dish) {
		System.out.println("Cooking "+dish);
	}
	@Override
	public String deliver() {
		return "Food Delivered from "+resLocation;
	}
	@Override
	public String serve() {
		return "Food Serving from "+resLocation;
	}
	@Override
	public String generateBill() {
		return "Bill generated for "+resName;
	}
}
