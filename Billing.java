package Project_ol;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
public class Billing extends PizzaOrder{

	
	void display(ArrayList<Integer> vegPrices,ArrayList<Integer> nonVegPrices,ArrayList<Integer> totalQuantityVeg,ArrayList<Integer> totalQuantityNonVeg,ArrayList<Integer> pizzaOrderVeg,ArrayList<Integer> pizzaOrderNonVeg)
	{
		
		int total=0;
		
		String[] pizzanameveg = new String[100];
		String[] pizzanamenonveg = new String[100];
		
		for(int j=0;j<vegPrices.size();j++)
		{
			if(pizzaOrderVeg.get(j)==1)
			{
				pizzanameveg[j]="Margherita";
			}
			else if (pizzaOrderVeg.get(j)==2)
			{
				pizzanameveg[j]="Peppy Paneer";
			}
			else if (pizzaOrderVeg.get(j)==3)
			{
				pizzanameveg[j]="Farm House";
			}
			else if (pizzaOrderVeg.get(j)==4)
			{
				pizzanameveg[j]="Country Special";
			}
		}
		
		for(int j=0;j<nonVegPrices.size();j++)
		{
			if(pizzaOrderNonVeg.get(j)==1)
			{
				pizzanamenonveg[j]="Chicken Dominator";
			}
			else if (pizzaOrderNonVeg.get(j)==2)
			{
				pizzanamenonveg[j]="Chicken Corn";
			}
			else if (pizzaOrderNonVeg.get(j)==3)
			{
				pizzanamenonveg[j]="Bacon";
			}
			else if (pizzaOrderNonVeg.get(j)==4)
			{
				pizzanamenonveg[j]="Fresh Meat";
			}
		}
		
		System.out.println("\nThank you, "+CustomerDetails.name+" your Bill Receipt has been generated !!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDo you want to enter a feedback? (1-Yes|0-No): ");
		int fb = sc.nextInt();
		if(fb==1) {
			Feedback.userfb();
		}
		else
			System.out.println("\nThank you! Visit Again!");
	
		
		 File file = new File("Bill.txt");
	     
	     PrintStream stream=null;
	     
		try {
			stream = new PrintStream(file);
			System.setOut(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
	     
	     
		System.out.printf("%60s"," ********** Final Bill **********\n\n");
		System.out.println("====================================================================================");
		System.out.printf("%-30s %5s %15s %12s %15s\n","Pizza Name","Size","Quantity","Price","Total Amount");
		System.out.println("====================================================================================\n");
		
		if(pizzaOrderVeg.size()>0)
		{
			for(int i=0;i<pizzaOrderVeg.size();i++)
			{
				System.out.printf("%-30s %3s %13d %15d %14d\n\n",pizzanameveg[i],PizzaOrder.sizeVeg.get(i),totalQuantityVeg.get(i),vegPrices.get(i),(vegPrices.get(i)*totalQuantityVeg.get(i)));
				total+=vegPrices.get(i)*totalQuantityVeg.get(i);
				
			
			}
			
		
			
	
		}
		if(pizzaOrderNonVeg.size()>0)
		{
			
			for(int k=0;k<pizzaOrderNonVeg.size();k++)
			{
				System.out.printf("%-30s %3s %13d %15d %14d\n\n",pizzanamenonveg[k],PizzaOrder.sizeNonVeg.get(k),totalQuantityNonVeg.get(k),nonVegPrices.get(k),(nonVegPrices.get(k)*totalQuantityNonVeg.get(k)));
				total+=nonVegPrices.get(k)*totalQuantityNonVeg.get(k);
			}
		}
			System.out.println("====================================================================================");
			System.out.printf("Grand Total %67d\n" , total);
			System.out.println("====================================================================================");
			
			System.out.println("\n\t\t\t"+CustomerDetails.name + " Thanks for Ordering! "+"\n\n              Your order will be delivered at this address:  " + CustomerDetails.Address);
			
			stream.close();

			
			
			
			
						
		
		
	}

}
