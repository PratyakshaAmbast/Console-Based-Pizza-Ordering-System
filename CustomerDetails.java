package Project_ol;
import java.util.*;
import java.io.IOException;

public class CustomerDetails{
	static String name;
	static String Address;

	void Details() {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		// User details asked
		
		long length = 0,phoneNum=0;
		try {
			System.out.print("Please enter your name: ");
			name = sc.nextLine();

		} catch (InputMismatchException ime) {
			System.out.println("Please Enter a valid name");
		}
		
		try
		{
		while (length != 10) {
				System.out.print("\nPlease enter your contact number: ");
			
				phoneNum = sc.nextLong();
			
				length = (long) (Math.log10(phoneNum) + 1);

				if (length != 10) 
				{
					System.out.println("\nEnter correct mobile number");
				} 
				
		}
		}
		catch (InputMismatchException ie)
		{
			System.out.println("Please enter only digits.");
		}
		try 
		{
			System.out.print("\nPlease enter your Address: ");
			Address = sc1.nextLine();	

		} 
		catch (InputMismatchException im) 
		{
			System.out.println("Please enter a valid address");
		}

		System.out.println("\nHello " + name + "!!!. Welcome to Pizza Station !!!\n");
		

	}
	
}
