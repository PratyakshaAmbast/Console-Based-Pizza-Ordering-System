package Project_ol;
import java.util.*;
public  class Menu implements NonVegMenu{
	
	
	ArrayList<String> vegPizzas = new ArrayList<String>();
	ArrayList<String> nonVegPizzas = new ArrayList<String>();
	
	// Veg and Non Veg menu generated
	
	@Override
	public void addToVegMenu() {

		vegPizzas.add("Margherita");
		vegPizzas.add("Peppy Paneer");
		vegPizzas.add("Farmhouse");
		vegPizzas.add("Country Special");

		
	}
	
	@Override
	public void addToNonVegMenu() {

		nonVegPizzas.add("Chicken Dominator");
		nonVegPizzas.add("Chicken corn");
		nonVegPizzas.add("Bacon");
		nonVegPizzas.add("Fresh Meat");
		
	}
	
	// Displayed veg and non veg menu
	
	@Override
	public void displayVegMenu() {
		System.out.println("\n*** Our Veg Pizzas ***");
		for (int i = 0; i < vegPizzas.size(); i++) { 
            System.out.println((i+1) + ". "  + vegPizzas.get(i));
		}
	}
	
	@Override
	public void displayNonVegMenu() {
		System.out.println("\n*** Our Non Veg Pizzas ***");
		for (int i = 0; i < nonVegPizzas.size(); i++) { 
            System.out.println((i+1) + ". "  + nonVegPizzas.get(i));
	}
		
	
	
	}
//	
	
}
