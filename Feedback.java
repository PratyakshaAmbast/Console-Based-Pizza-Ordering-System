package Project_ol;
import java.util.*;

public class Feedback {
	static void userfb() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nHow much would you like to rate on the scale from 1 to 5: ");
		int rating = sc.nextInt();
		switch(rating) {
		case 1:
			System.out.println("\nVery Poor User Experience! We would improve our service next time! Thank you! Visit Again!\n");
			break;
		case 2:
			System.out.println("\nPoor User Experience! We would improve our service next time! Thank you! Visit Again!\n");
			break;
		case 3:
			System.out.println("\nAverage User Experience! We will get better! Thank you! Visit Again!\n");
			break;
		
		case 4:
			System.out.println("\nGood User Experience! Almost Perfect! Thank you! Visit Again!\n");
			break;
		
		case 5:
			System.out.println("\nExcellent User Experience! Thank you! Visit Again!\n");
			break;
	}
	
	}
}
