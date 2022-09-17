package Project_ol;
import java.util.*;
public class ProjectMain{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("\t\t\t\t **************** Welcome to Pizza Station ****************\n");
		CustomerDetails custDetails = new CustomerDetails();  // object of customerdetails class created
		custDetails.Details();
		PizzaOrder pizzaorderprice = new PizzaOrder();   // object of pizzaorder class created
		pizzaorderprice.orderPizza();
		
	}

}
