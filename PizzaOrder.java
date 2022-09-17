package Project_ol;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrder extends Menu
{
	public int Choice;
	public ArrayList<Integer> pizzaOrderVeg = new ArrayList<Integer>();
	public ArrayList<Integer> pizzaOrderNonVeg = new ArrayList<Integer>();
	public ArrayList<Integer> totalQuantityVeg = new ArrayList<Integer>();
	public ArrayList<Integer> totalQuantityNonVeg = new ArrayList<Integer>();
	static public ArrayList<String> sizeNonVeg = new ArrayList<String>();
	static public ArrayList<String> sizeVeg = new ArrayList<String>();
	public ArrayList<Integer> vegPrices = new ArrayList<Integer>();
	public ArrayList<Integer> nonVegPrices = new ArrayList<Integer>();
	
	
	public void orderPizza() {
		
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();

		menu.addToVegMenu();
		menu.addToNonVegMenu();
		do
		{
		System.out.println("\n*** Menu ***");
		System.out.println("1. Display Veg Menu \n2. Display non veg menu");
		System.out.print("\nEnter your choice: ");
		int menuChoice = sc.nextInt();
		if (menuChoice == 1) {
			menu.displayVegMenu();
			System.out.print("\nEnter the pizza you want to order: ");
			int pizzaChoice = sc.nextInt();
			if(pizzaChoice>=1&&pizzaChoice<=4)
				pizzaOrderVeg.add(pizzaChoice);
			else
			{
				System.out.println("\nWrong choice entered. No pizza ordered. Please enter correct choice.");
				continue;
			}
			
			System.out.print("\nEnter the size of your pizza (s/m/l): ");
			String sizeChoice = sc.next();
			sizeVeg.add(sizeChoice);
			System.out.print("\nEnter the quantity of pizza: ");
			int quantity = sc.nextInt();
			totalQuantityVeg.add(quantity);
		}
		else if (menuChoice == 2) {
			menu.displayNonVegMenu();
			System.out.print("\nEnter the pizza you want to order: ");
			int pizzaChoice = sc.nextInt();
			
			if(pizzaChoice>=1&&pizzaChoice<=4)
				pizzaOrderNonVeg.add(pizzaChoice);
			else
			{
				System.out.println("\nWrong choice entered. No pizza ordered. Please enter correct choice.");
				continue;
			}
			
			
			System.out.print("\nEnter the size of your pizza (s/m/l): ");
			String sizeChoice = sc.next();
			sizeNonVeg.add(sizeChoice);
			System.out.print("\nEnter the quantity of pizza: ");
			int quantity = sc.nextInt();
			totalQuantityNonVeg.add(quantity);
		}
		else {
			System.out.print("\nEnter Correct choice");
		}
		System.out.println("\n==================================================");
		System.out.print("\nDo you want to order more pizza? (Yes-1 or No-0): ");
		Choice = sc.nextInt();
		}while(Choice!=0);
		
		Pricing();
		
		
	}
	
	public void Pricing()
	{
		
		for(Integer userChoice:pizzaOrderVeg)
		{
		switch (userChoice) {
		case 1:
			if (sizeVeg.contains("s")||sizeVeg.contains("S")) {
				vegPrices.add(100);
			}
			else if (sizeVeg.contains("m")||sizeVeg.contains("M")) {
				vegPrices.add(200);
			}
			else if (sizeVeg.contains("l")||sizeVeg.contains("L")) {
				vegPrices.add(300);
			}
			break;
		case 2:
			if (sizeVeg.contains("s")||sizeVeg.contains("S")) {
				vegPrices.add(150);
			}
			else if (sizeVeg.contains("m")||sizeVeg.contains("M")) {
				vegPrices.add(250);
			}
			else if (sizeVeg.contains("l")||sizeVeg.contains("L")) {
				vegPrices.add(350);
			}
			break;
		case 3:
			if (sizeVeg.contains("s")||sizeVeg.contains("S")) {
				vegPrices.add(175);
			}
			else if (sizeVeg.contains("m")||sizeVeg.contains("M")) {
				vegPrices.add(275);
			}
			else if (sizeVeg.contains("l")||sizeVeg.contains("L")) {
				vegPrices.add(375);
			}
			break;
		case 4:
			if (sizeVeg.contains("s")||sizeVeg.contains("S")) {
				vegPrices.add(190);
			}
			else if (sizeVeg.contains("m")||sizeVeg.contains("M")) {
				vegPrices.add(290);
			}
			else if (sizeVeg.contains("l")||sizeVeg.contains("L")) {
				vegPrices.add(390);
			}
			break;
		}
		}
		
		for(Integer userChoice:pizzaOrderNonVeg)
		{
		switch (userChoice) {
		case 1:
			if (sizeNonVeg.contains("s")||sizeNonVeg.contains("S")) {
				nonVegPrices.add(150);
			}
			else if (sizeNonVeg.contains("m")||sizeNonVeg.contains("M")) {
				nonVegPrices.add(250);
			}
			else if (sizeNonVeg.contains("l")||sizeNonVeg.contains("L")) {
				nonVegPrices.add(350);
			}
			break;
		case 2:
			if (sizeNonVeg.contains("s")||sizeNonVeg.contains("S")) {
				nonVegPrices.add(250);
			}
			else if (sizeNonVeg.contains("m")||sizeNonVeg.contains("M")) {
				nonVegPrices.add(350);
			}
			else if (sizeNonVeg.contains("l")||sizeNonVeg.contains("L")) {
				nonVegPrices.add(550);
			}
			break;
		case 3:
			if (sizeNonVeg.contains("s")||sizeNonVeg.contains("S")) {
				nonVegPrices.add(200);
			}
			else if (sizeNonVeg.contains("m")||sizeNonVeg.contains("M")) {
				nonVegPrices.add(300);
			}
			else if (sizeNonVeg.contains("l")||sizeNonVeg.contains("L")) {
				nonVegPrices.add(500);
			}
			break;
		case 4:
			if (sizeNonVeg.contains("s")||sizeNonVeg.contains("S")) {
				nonVegPrices.add(200);
			}
			else if (sizeNonVeg.contains("m")||sizeNonVeg.contains("M")) {
				nonVegPrices.add(350);
			}
			else if (sizeNonVeg.contains("l")||sizeNonVeg.contains("L")) {
				nonVegPrices.add(450);
			}
			break;
		}
		}
		
		Billing b = new Billing();
		
		b.display(vegPrices, nonVegPrices, totalQuantityVeg, totalQuantityNonVeg,pizzaOrderVeg,pizzaOrderNonVeg);
	}
}


